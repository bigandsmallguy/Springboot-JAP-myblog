package com.cos.myblog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1 {

@GetMapping("/test/hello")
public String hello() {
	return "<h1>hello spring boot</h1>";
	
}

}
