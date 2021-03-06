package com.lgh.springcloud.hello.service.api.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgh.springcloud.hello.service.api.dto.User;

@RequestMapping("/refactor")
public interface HelloService {

	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	String hello(@RequestParam("name") String name);

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

	@RequestMapping(value = "/hello3", method = RequestMethod.POST)
	String hello(@RequestBody User user);

}
