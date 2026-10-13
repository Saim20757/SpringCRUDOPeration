package com.example.CrudSpringBoot.Controller;

import com.example.CrudSpringBoot.Entity.Student;
import com.example.CrudSpringBoot.Service.StudentService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Create Student //HTTP Request--> Post //End Point -->/api/students/create
    @PostMapping("/create")
    public String createStudent(@RequestBody Student student){
       Student createdStudent=studentService.createdStudent(student);
        System.out.println("Inside Controller");
       return "Student created" ;

    }
    //Read Student//Read One//HTTp Request-->GET //End point -->/api/students/get/{id}
                  //Read All//SHttp Request -->GET//End point -->/api/students/getAll


    //Update Student //Update//Http Request-->PUT//Endpoint -->/api/students/update/{id}



    //Delete Student//Delete Student//Http Request-->DELETE//Endpoints-->/api/students/delete/{id}



}
