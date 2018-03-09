package com.consumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.consumer.client.hystrix.AccountFeignHystrix;

/**
 * feign的value值一定是服务注册的值，@requestMapping的值一定和服务中的路径一致
 * 
 * @requestParam 的value不能为空必须要写
 * 
 * @author Augus
 * @email augus.bps@qq.com
 * @time 2018年3月9日下午4:15:43
 *
 */
@FeignClient(value = "ACCOUNT-SERVICE", fallback = AccountFeignHystrix.class)
public interface AccountFeignClient {

	@RequestMapping("/hi")
	String sendToSayHi(@RequestParam(value = "name") String name);
}
