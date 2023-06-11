package com.springproject.springproject.controller;

import com.springproject.springproject.courseService.courseInterface;
import com.springproject.springproject.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class courseController {

    @Autowired
    private courseInterface courseService;

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }
}
