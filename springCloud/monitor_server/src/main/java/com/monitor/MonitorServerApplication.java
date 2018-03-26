package com.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 断路器聚合监控
 * @author Augus
 * @email augus.bps@qq.com
 * @time 2018年3月26日下午2:36:00
 * Hystrix Turbine将每个服务Hystrix Dashboard数据进行了整合
 */
@EnableTurbine //包含注册服务的注解
@SpringBootApplication
public class MonitorServerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(MonitorServerApplication.class, args);
    }
}
