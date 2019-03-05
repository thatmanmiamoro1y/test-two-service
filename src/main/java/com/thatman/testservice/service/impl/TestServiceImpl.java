package com.thatman.testservice.service.impl;

import com.thatman.testservice.Entity.User;
import com.thatman.testservice.client.TestServiceFourClient;
import com.thatman.testservice.client.TestServiceThreeClient;
import com.thatman.testservice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestServiceThreeClient testServiceThreeClient;
    @Autowired
    TestServiceFourClient testServiceFourClient;


    @Override
    public User getUser() {
        User user=new User();
        System.out.println("------------------->>"+user.getUserName());
        System.out.println("------------------->>"+user.getUserPassword());
        return testServiceFourClient.getUser();
    }
}
