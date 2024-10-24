package com.jiawa.train.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
public class TrainMemberApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TrainMemberApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("启动成功！！");
        log.info("测试地址: \thttp://127.0.0.1:{}/hello", env.getProperty("server.port"));
    }

}
