package org.timmtiy.ordering.system.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.timmtiy.ordering.system.service.service.LoginService;
import org.timmtiy.ordering.system.web.dto.LoginRequestDTO;
import org.timmtiy.ordering.system.web.dto.LoginResponseDTO;
import org.timmtiy.ordering.system.web.util.Convert;

import javax.annotation.Resource;

@RestController
public class LoginController {

    private static Logger log = LoggerFactory.getLogger("login");

    @Resource
    private LoginService loginService;

    @RequestMapping("/login")
    @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO requestDTO){
        log.info(requestDTO.toString());
        LoginResponseDTO responseDTO = new LoginResponseDTO();
        responseDTO.setSuccess(loginService.login(Convert.convertDTOToVO(requestDTO)));
        return responseDTO;
    }
}
