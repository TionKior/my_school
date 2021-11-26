package com.tionkior.jspboot.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("h_appoint")
public class Appoint {

  private Long id;
  private String stuId;
  private String typeId;
  private String place;
  private java.sql.Timestamp time;

}
