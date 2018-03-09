package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务发现
 * @author Augus
 * @email augus.bps@qq.com
 * @time 2018年3月9日上午10:09:13
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
