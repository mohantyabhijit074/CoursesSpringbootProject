package com.springproject.springproject.courseService.Impl;

import com.springproject.springproject.courseService.courseInterface;
import com.springproject.springproject.dao.courseDao;
import com.springproject.springproject.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class courseServiceImpl implements courseInterface {

    @Autowired
    private courseDao courseDao;
    List<Course> newCourse;
    public courseServiceImpl() {
        newCourse = new ArrayList<>();
        newCourse.add(new Course(1L,"hello","my first sprinboot project"));
    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(Long courseId) {
        return courseDao.getById(courseId);
    }

    @Override
    public Course createCourse(Course course) {
        courseDao.save(course);
        return course;
    }


}
