package com.learning.springboot101;

import lombok.Data;

@Data
public class Course {
    private int id;
    private String name;
    private String author;

    public Course(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
}
