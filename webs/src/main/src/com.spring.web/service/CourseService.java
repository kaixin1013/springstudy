package com.spring.web.service;

import com.spring.web.entity.CourseVo;
import com.spring.web.entity.CourseVo;

import java.util.List;

public interface CourseService {
    List<CourseVo> selectCurrentCourses();
}
