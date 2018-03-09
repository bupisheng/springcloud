package com.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


public interface AccountService {

	//String sayHello(String name);

	String sendToSayHi(String name);
}
