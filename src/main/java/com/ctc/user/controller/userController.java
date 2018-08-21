package com.ctc.user.controller;

import com.ctc.user.model.userModel;
import com.ctc.user.repository.userRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class userController {
    private static final Logger LOG = LoggerFactory.getLogger(userController.class);

    @Autowired
    private userRepository _userRepository;

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping(){
        LOG.info("##CTC##UserService## Ping Pong");
        return new Date().toString();
    }

    @RequestMapping(value = "/getuserById/{id}", method = RequestMethod.GET)
    public userModel getUserRole(@PathVariable("id") Integer id){
        LOG.info("##CTC##UserService## Get Role for " + id);
        return _userRepository.findById(id).get();
    }
    @RequestMapping(value = "/getallusers", method = RequestMethod.GET)
    public List<userModel> getAllUsers(){
        LOG.info("##CTC##UserService## Get All Users ");
        return _userRepository.findAll();
    }
}
