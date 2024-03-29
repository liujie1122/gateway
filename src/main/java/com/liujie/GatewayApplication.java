package com.liujie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * @program: bserver
 * @description: qwe
 * @author: LiuJie
 * @create: 2019-05-15 11:27
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableEurekaClient
public class GatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}