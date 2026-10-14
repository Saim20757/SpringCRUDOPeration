package com.example.CrudSpringBoot.Service;

import com.example.CrudSpringBoot.Entity.Student;
import com.example.CrudSpringBoot.Repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentreq){
      //Store To db
        // Business logic
        System.out.println("Inside Student Service");

    Student studentres =studentRepository.saveStudent(studentreq);
        System.out.println("Exiting  Student Service");
    return  studentres;
    }



}
