package com.jiawa.train.member.controller;

import com.jiawa.train.common.resp.CommonResp;
import com.jiawa.train.member.controller.req.MemberLoginReq;
import com.jiawa.train.member.controller.req.MemberRegisterReq;
import com.jiawa.train.member.controller.req.MemberSendCodeReq;
import com.jiawa.train.member.response.MemberLoginResp;
import com.jiawa.train.member.service.MemberService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private MemberService memberService;

    @GetMapping("/count")
    public Integer count() {
        return memberService.count();
    }

    @PostMapping("/register")
    public CommonResp<Long> register(@Valid MemberRegisterReq memberRegisterReq) {
        return memberService.register(memberRegisterReq);
    }

    @PostMapping("/send-code")
    public CommonResp<Long> sendCode(@Valid MemberSendCodeReq req) {
        memberService.sendCode(req);
        return new CommonResp<>();
    }

    @PostMapping("/login")
    public CommonResp<MemberLoginResp> login(@Valid MemberLoginReq req) {
        MemberLoginResp resp = memberService.login(req);
        return new CommonResp<>(resp);
    }
}
