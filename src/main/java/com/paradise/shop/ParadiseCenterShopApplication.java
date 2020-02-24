package com.paradise.shop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ParadiseCenterShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParadiseCenterShopApplication.class, args);
        log.info("启动 OK");
    }

}
