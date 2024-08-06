package com.example.CRUD_project;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    private Long id;
    private String name;
    private String phone;
    private String email;


}
