package org.techforumist.basic.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureRestController {

	@RequestMapping("/sayHello")
	public String sayHello() {
		return "Hello World!";
	}
}
