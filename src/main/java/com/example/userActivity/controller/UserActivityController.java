package com.example.userActivity.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userActivity.payloads.UserActivityDto;
import com.example.userActivity.services.UserActivityService;

@RestController
@RequestMapping("/user-activity")
public class UserActivityController {

	@Autowired
	private UserActivityService userActivityService;

	@PostMapping("/saveUserActivity")
	public ResponseEntity<UserActivityDto> saveLoginActivity(@RequestBody UserActivityDto userActivityDto) {
		LocalDateTime now = LocalDateTime.now();
		userActivityDto.setLoginTime(now);
		System.out.println("LocalDateTime : " + now);
		UserActivityDto saveLogInActivity = this.userActivityService.saveUserActivity(userActivityDto);
		 ResponseEntity<UserActivityDto> responseEntity = new ResponseEntity<UserActivityDto>(saveLogInActivity,
				HttpStatus.CREATED);

		return responseEntity;

	}

	

}
