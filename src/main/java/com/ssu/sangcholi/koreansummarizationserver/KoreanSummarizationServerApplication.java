package com.ssu.sangcholi.koreansummarizationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSidecar
public class KoreanSummarizationServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(KoreanSummarizationServerApplication.class, args);
    }
}
