package com.tionkior.jspboot;

import com.tionkior.jspboot.entity.*;
import com.tionkior.jspboot.mapper.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@SpringBootTest
class JspbootApplicationTests {

    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private AnnouncementMapper announcementMapper;
    @Autowired
    private AppinNumberMapper appinNumberMapper;
    @Autowired
    private AppointMapper appointMapper;
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private ReportMapper reportMapper;
    @Autowired
    private StudentsMapper studentsMapper;
    @Autowired
    private VaccineMapper vaccineMapper;
    @Autowired
    private WaitMapper waitMapper;

    @Test
    void adminMapper() {
        List<Admin> admins = adminMapper.selectList(null);
        System.out.println(admins);
    }

    @Test
    void announcementMapper() {
        List<Announcement> announcements = announcementMapper.selectList(null);
        System.out.println(announcements);
    }

    @Test
    void appinNumberMapper() {
        List<AppinNumber> appinNumbers = appinNumberMapper.selectList(null);
        System.out.println(appinNumbers);
    }

    @Test
    void appointMapper() {
        List<Appoint> appoints = appointMapper.selectList(null);
        System.out.println(appoints);
    }

    @Test
    void doctorMapper() {
        List<Doctor> doctors = doctorMapper.selectList(null);
        System.out.println(doctors);
    }

    @Test
    void reportMapper() {
        List<Report> reports = reportMapper.selectList(null);
        System.out.println(reports);
    }

    @Test
    void studentsMapper() {
        List<Students> students = studentsMapper.selectList(null);
        System.out.println(students);
    }

    @Test
    void vaccineMapper() {
        List<Vaccine> vaccines = vaccineMapper.selectList(null);
        System.out.println(vaccines);
    }

    @Test
    void waitMapper() {
        List<Wait> waits = waitMapper.selectList(null);
        System.out.println(waits);
    }

}
