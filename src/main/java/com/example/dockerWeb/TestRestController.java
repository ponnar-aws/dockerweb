package com.example.dockerWeb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	 @RequestMapping(method = RequestMethod.GET, value="/testurl")
	 public String getAllStudents() {
		  return "test rest controller";
		  }
}
