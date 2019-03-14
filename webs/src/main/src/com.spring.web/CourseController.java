package com.spring.web;

import com.spring.web.entity.CourseVo;

import com.spring.web.service.CourseService;
import com.spring.web.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;


    @RequestMapping(value = "courses", method = RequestMethod.GET)
    public List<CourseVo> selectCourses() {
        List<CourseVo> courseVOList = courseService.selectCurrentCourses();
        return courseVOList;
    }
}
