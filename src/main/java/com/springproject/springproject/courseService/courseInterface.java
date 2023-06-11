package com.springproject.springproject.courseService;

import com.springproject.springproject.entities.Course;

import java.util.List;

public interface courseInterface {
    public List<Course> getCourses();

    Course getCourse(Long courseId);

    Course createCourse(Course course);
}
