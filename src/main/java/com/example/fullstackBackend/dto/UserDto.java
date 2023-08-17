package com.example.fullstackBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//used for record and intertransmission
//all fields wil not be filled together
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String login;
    private String token;
}
