package com.service.registrycenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

//	此处为不用熔断器
	
//	@Autowired
//	RestTemplate restTemplate;
//	
//	@RequestMapping(value = "/add",method = RequestMethod.GET)
//	public String add(){
//		return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
//	}
//	
//	@RequestMapping(value = "/multiplication",method = RequestMethod.GET)
//	public String multiplication(){
//		return restTemplate.getForEntity("http://COMPUTE-SERVICE/multiplication?a=10&b=20", String.class).getBody();
//	}
	
//	此处为用应用熔断器
	
	@Autowired
	private ComputeService computeService;
	
	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public String add(){
		return computeService.addService();
	}
	
}
