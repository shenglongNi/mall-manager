package com.mall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserLoginCotroller {

    private static Logger logger = LoggerFactory.getLogger(UserLoginCotroller.class);
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {


        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToke
                = new UsernamePasswordAuthenticationToken(username, passwordEncoder.encodePassword(password, null));


        try {
            Authentication authenticate = authenticationManager.authenticate(usernamePasswordAuthenticationToke);
            SecurityContextHolder.getContext().setAuthentication(authenticate);
//     TODO   更新登录时间
//      TODO  记录登录日志
        } catch (AuthenticationException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }
}
