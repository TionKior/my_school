package com.tionkior.jspboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("h_appin_number")
public class AppinNumber {

  private java.sql.Date data;
  private Long number;

}
