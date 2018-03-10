package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul的主要功能是路由转发和过滤器。路由功能是微服务的一部分，比如／api/user转发到到user服务，/api/shop转发到到shop服务。
 * zuul默认和Ribbon结合实现了负载均衡的功能。
 * @author Augus
 * @email augus.bps@qq.com
 * @time 2018年3月10日上午10:15:32
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulServerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZuulServerApplication.class, args);
    }
}
