package org.exp.springboot.common;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	@RequestMapping
	public String sayHello () {
		return "Hello!";
	}
}
