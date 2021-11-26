package com.tionkior.jspboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("h_vaccine")
public class Vaccine {

  private Long id;
  private String typeId;
  private String name;
  private Long quantity;

}
