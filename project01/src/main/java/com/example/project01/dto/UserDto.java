package com.example.project01.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private int id;
    private String username;
    private String password;
    private List<ItemDto> items;
}
