package com.springproject.springproject.dao;

import com.springproject.springproject.entities.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courseDao extends JpaRepository<Course,Long> {
}
