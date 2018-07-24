package com.home.calendarevent.service;

import com.home.calendarevent.entities.UserEntity;
import com.home.calendarevent.model.Event;
import com.home.calendarevent.model.User;
import com.home.calendarevent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public List<User> findAllUsers(){
        List<UserEntity> userEntityList = new ArrayList<>();
        userEntityList = userRepository.findAll();

        return userEntityList.stream().map(userEntity -> new User(userEntity.getUserId(), userEntity.getFirstName(), userEntity.getLastName())
                ).collect(Collectors.toList());

    }

    public List<Event> GetEventsForUser(String User){ // TO DO
        return null;
    }
}
