package com.consumer.client.hystrix;

import org.springframework.stereotype.Component;

import com.consumer.client.AccountFeignClient;

@Component
public class AccountFeignHystrix implements AccountFeignClient{

	@Override
	public String sendToSayHi(String name) {
		return "say hello failed！";
	}

}
