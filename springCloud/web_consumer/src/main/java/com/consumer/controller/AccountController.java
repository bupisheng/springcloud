package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.service.AccountService;

@RequestMapping
@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/hi")
	public String sayHi(String name){
		return accountService.sendToSayHi(name);
	}
}
