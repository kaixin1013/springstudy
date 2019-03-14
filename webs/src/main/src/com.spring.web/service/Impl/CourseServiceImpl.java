package com.spring.web.service.Impl;

import com.spring.web.dao.CourseDAO;

import com.spring.web.entity.CourseVo;
import com.spring.web.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseDAO courseDAO;
    @Override
    public List<CourseVo> selectCurrentCourses() {
        return courseDAO.selectCurrentCourses();
    }
}

