package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务的消费者
 * @author Augus
 * @email augus.bps@qq.com
 * @time 2018年3月9日上午11:38:17
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients //注解开启feign的功能
@EnableHystrix //开启断路器功能
public class WebConsumerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(WebConsumerApplication.class, args);
    }
    
//    @Bean
//    @LoadBalanced //负载均衡注解
//    RestTemplate restTemplate(){
//    	return new RestTemplate();
//    }
}
