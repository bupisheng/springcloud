package com.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="ACCOUNT-SERVICE")
public interface IAccountService {

	@RequestMapping("/hi")
	String sendToSayHi(@RequestParam(value="name") String name);
}
