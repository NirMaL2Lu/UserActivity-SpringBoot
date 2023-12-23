package com.example.userActivity.payloads;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserActivityDto {

	private Long logId;

	private Long userId;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime loginTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime logoutTime;

	public UserActivityDto() {
		
	}

	public UserActivityDto(Long logId, Long userId, LocalDateTime loginTime, LocalDateTime logoutTime) {
		super();
		this.logId = logId;
		this.userId = userId;
		this.loginTime = loginTime;
		this.logoutTime = logoutTime;
	}

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public LocalDateTime getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(LocalDateTime loginTime) {
		this.loginTime = loginTime;
	}

	public LocalDateTime getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(LocalDateTime logoutTime) {
		this.logoutTime = logoutTime;
	}

	@Override
	public String toString() {
		return "UserActivityDto [logId=" + logId + ", userId=" + userId + ", loginTime=" + loginTime + ", logoutTime="
				+ logoutTime + "]";
	}
	
	
	
}
