package com.tionkior.jspboot.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("h_announcement")
public class Announcement {

  private Long id;
  private java.sql.Date creatTime;
  private String title;
  private String content;

}
