package com.tiara.StudentSystem.service;

import com.tiara.StudentSystem.model.Student;
import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
