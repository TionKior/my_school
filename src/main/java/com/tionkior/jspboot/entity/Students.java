package com.tionkior.jspboot.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("h_students")
public class Students {

    private Long id;
    private String username;
    private String password;
    private String gender;
    private Long age;
    private String name;
    private String roleId;
    private String role;
    private Long mobile;
    private String state;
    private String dom;
    private String vaccResult;
    private java.sql.Timestamp vaccTime;
    private String detecResult;
    private java.sql.Timestamp detecTime;

}
