package com.simplilearn.usersms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusCheckController {

	@GetMapping("users/status/check")
	public String statusCheck() {
		return "users-ms is working..";
	}
}
