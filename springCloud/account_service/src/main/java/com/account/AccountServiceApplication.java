package com.account;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账号服务提供者
 * @author Augus
 * @email augus.bps@qq.com
 * @time 2018年3月9日上午10:45:28
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class AccountServiceApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(AccountServiceApplication.class, args);
    }
    
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
    	return "欢迎 "+name+" come home,port="+port;
    }
}
