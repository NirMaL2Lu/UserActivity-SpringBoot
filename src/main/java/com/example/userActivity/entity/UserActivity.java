package com.example.userActivity.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@Entity
@Table(name = "user_activity")

public class UserActivity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private Long logId;
	
	@Column(nullable = false)
	private Long userId;
	
	@Column(nullable = true)	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime loginTime;
	
	@Column(nullable = true)	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime logoutTime;
	
	public UserActivity() {
		
	}

	public UserActivity(Long logId, Long userId, LocalDateTime loginTime, LocalDateTime logoutTime) {
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
		return "UserActivity [logId=" + logId + ", userId=" + userId + ", loginTime=" + loginTime + ", logoutTime="
				+ logoutTime + "]";
	}
	
	
	
	

}
