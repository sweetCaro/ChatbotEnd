package com.example.chatbotend.mapper;

import com.example.chatbotend.dao.UserDao;
import com.example.chatbotend.service.UserService;
import com.example.chatbotend.domin.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
