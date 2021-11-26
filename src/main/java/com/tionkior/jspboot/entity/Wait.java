package com.tionkior.jspboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("h_wait")
public class Wait {

    private Long id;
    private Long stuId;
    private String result;

}
