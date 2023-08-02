package com.spring_app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CustomerRequest {

    private  String name;
    private String email;
    private Integer age;


}
