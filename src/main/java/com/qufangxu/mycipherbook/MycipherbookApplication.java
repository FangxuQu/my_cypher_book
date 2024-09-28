package com.qufangxu.mycipherbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MycipherbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycipherbookApplication.class, args);
        log.info("接口地址：http://localhost:8080/doc.html");
    }

}
