package com.thaya.studentmanagement.controller;

import com.thaya.studentmanagement.entity.Student;
import com.thaya.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Handles HTTP requests and responses. gets data from service layer

@RestController
@RequestMapping("/api/students")
public class studentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id){
         studentService.deleteStudent(id);
         return "Student Deleted Succesfully";
    }




}
