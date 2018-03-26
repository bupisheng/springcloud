package com.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 断路器仪表盘
 * 当对特定的服务的调用的不可用达到一个阀值（Hystric 是5秒20次） 断路器将会被打开。
 * 断路打开后，可用避免连锁故障，fallback方法可以直接返回一个固定值。
 * @author Augus
 * @email augus.bps@qq.com
 * @time 2018年3月9日下午2:49:32
 *
 */

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class HystrixDashboardApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }
}
