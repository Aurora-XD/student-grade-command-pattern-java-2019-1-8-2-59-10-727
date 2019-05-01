package com.tw;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String studentId;
    private String studentName;

    public Map<String,Double> studentScore = new HashMap<>();

    public Student(String name,String id){
        this.studentName = name;
        this.studentId = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentScore(String subject,Double score){
        studentScore.put(subject,score);
    }
}
