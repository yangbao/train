package com.jiawa.train.member.controller.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

/**
 * @Classname MemberSendCodeReq
 * @Description MemberSendCodeReq
 * @Date 2024/11/4 9:14
 * @Created by paul
 */
public class MemberSendCodeReq {
    @NotBlank(message = "【手机号】不能为空")
    @Pattern(regexp = "^1\\d{10}$", message = "手机号码格式错误")
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "MemberSendCodeReq {" +
                "mobile='" + mobile + '\'' + '}';
    }
}
