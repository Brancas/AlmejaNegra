package com.AlmejaNegra.model.request;

import lombok.Data;

@Data
public class NewUserRequest {

    private String name;
    private String email;
    private String tel;
    private String pass;
}
