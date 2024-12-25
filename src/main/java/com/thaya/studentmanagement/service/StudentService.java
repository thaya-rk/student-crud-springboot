package com.thaya.studentmanagement.service;

import com.thaya.studentmanagement.repository.StudentRepository;
import com.thaya.studentmanagement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//service layer contains the business logic of the application. ->it calls repository for db interaction

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Student Id not found"));
    }
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setEmail(updatedStudent.getEmail());
        existingStudent.setAge(updatedStudent.getAge());

        return studentRepository.save(existingStudent);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
