package com.tionkior.jspboot.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("h_admin")
public class Admin {

    private Long id;
    private String username;
    private String password;
    private String role;

}
