package com.tionkior.jspboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tionkior.jspboot.entity.Report;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReportMapper extends BaseMapper<Report> {

    void addReport(Report report);

}
