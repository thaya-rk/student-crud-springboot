package com.thaya.studentmanagement.repository;

//layer to interact with the database.

import org.springframework.data.jpa.repository.JpaRepository;
import com.thaya.studentmanagement.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Long> {

}
