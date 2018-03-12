package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置服务
 * @author Augus
 * @email augus.bps@qq.com
 * @time 2018年3月12日上午9:57:33
 *
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
