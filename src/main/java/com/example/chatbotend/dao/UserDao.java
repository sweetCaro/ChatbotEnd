package com.example.chatbotend.dao;

import com.example.chatbotend.domin.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserDao {
    List<User> getAllUsers();
}
