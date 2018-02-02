package com.service.registrycenter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class TestController {

	@RequestMapping(value="/test")
	public String test(String name) {
		System.out.println("启动成功");
		name = "feng";
		return name;
	}
}
