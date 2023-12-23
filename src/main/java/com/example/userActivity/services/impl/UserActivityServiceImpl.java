package com.example.userActivity.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userActivity.entity.UserActivity;
import com.example.userActivity.payloads.UserActivityDto;
import com.example.userActivity.repositories.UserActivityRepo;
import com.example.userActivity.services.UserActivityService;

@Service
public class UserActivityServiceImpl implements UserActivityService {
	@Autowired
	private UserActivityRepo activityRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	
	
	public UserActivityDto userActivityToDto(UserActivity userActivity) {
		UserActivityDto userActivityDto = this.modelMapper.map(userActivity, UserActivityDto.class);
		return userActivityDto;
	}
	
	public UserActivity DtoToUserActivity(UserActivityDto userActivityDto) {
		UserActivity userActivity = this.modelMapper.map(userActivityDto, UserActivity.class);
		return userActivity;
	}

	@Override
	public UserActivityDto saveUserActivity(UserActivityDto userActivityDto) {
		
		UserActivity userActivity = this.modelMapper.map(userActivityDto, UserActivity.class);
		UserActivity saveUserActivity = this.activityRepo.save(userActivity);
		UserActivityDto userActivityDto2 = this.modelMapper.map(saveUserActivity, UserActivityDto.class);
		
		return userActivityDto2;
	}

	
	
}
