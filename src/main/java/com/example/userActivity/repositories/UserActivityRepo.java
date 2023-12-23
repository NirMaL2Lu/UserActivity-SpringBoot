package com.example.userActivity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userActivity.entity.UserActivity;

public interface UserActivityRepo extends JpaRepository<UserActivity, Long> {

}
