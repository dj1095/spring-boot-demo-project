package com.learning.springboot101;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Rangakaranam"),
                new Course(2, "Learn GCP", "Rangakaranam"),
                new Course(3, "Learn DevOps", "Rangakaranam")
        );
    }
}
