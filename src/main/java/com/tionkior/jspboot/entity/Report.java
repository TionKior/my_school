package com.tionkior.jspboot.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("h_report")
public class Report {

    private Long id;
    private Long stuId;
    private String name;
    private Long mobile;
    @TableField("journey_14day")
    private String journey14Day;
    @TableField("fever_14day")
    private String fever14Day;
    private String contact;
    private String beforeSchool;
    private String afterSchool;

}
