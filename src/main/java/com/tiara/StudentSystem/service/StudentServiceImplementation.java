package com.tiara.StudentSystem.service;

import com.tiara.StudentSystem.model.Student;
import com.tiara.StudentSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    public Student get(Integer id) {
        return studentRepository.findById(id).get();
    }
    
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
}
