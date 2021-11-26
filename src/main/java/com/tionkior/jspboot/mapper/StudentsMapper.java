package com.tionkior.jspboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tionkior.jspboot.entity.Students;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentsMapper extends BaseMapper<Students> {

    int updateStudents(Students students);

    void updateS(Students students);
}
