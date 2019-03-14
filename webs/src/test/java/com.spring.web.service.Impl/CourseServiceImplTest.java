package com.spring.web.service.Impl;
import com.spring.web.entity.CourseVo;
import com.spring.web.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring_mybatis.xml"})
public class CourseServiceImplTest {
    @Autowired
    private CourseService courseService;

    @Test
    public void selectCurrentCourses() {
        List<CourseVo> courseVOList = courseService.selectCurrentCourses();
        courseVOList.forEach(courseVo -> System.out.println(courseVo));
    }
}

