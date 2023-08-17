package com.example.fullstackBackend.controllers;

import com.example.fullstackBackend.dto.CredentialsDto;
import com.example.fullstackBackend.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/login")

    public ResponseEntity<UserDto> login(@RequestBody CredentialsDto credentialsDto){
        UserDto user = new userService.login(credentialsDto);
        return ResponseEntity.ok(user);

    }


}
