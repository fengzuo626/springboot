package com.service.registrycenter.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 创建回调类
 * @author FengZuo
 * @创建时间：2018年2月2日上午11:44:51
 */
@Component
public class ComputeClientHystrix implements ComputeClient{

	@Override
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
		// TODO Auto-generated method stub
		return -9999;
	}

	
}
