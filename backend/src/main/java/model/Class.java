package main.java.model;

import java.util.HashMap;
import java.util.Map;

public class Class {
    private String name;
    private Map<String, Course> courseMap;

    public Class(String name) {
        this.name = name;
        this.courseMap = new HashMap<>();
    }

    public void addCourse(Course course, String id){
            courseMap.put(id, course);
    }
}
