package com.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * 服务追踪
 * @author Augus
 * @email augus.bps@qq.com
 * @time 2018年3月13日下午5:35:36
 *
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplication.class, args);
	}
}
