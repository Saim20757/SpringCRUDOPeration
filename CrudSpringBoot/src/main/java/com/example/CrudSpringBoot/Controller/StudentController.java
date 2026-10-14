package com.example.CrudSpringBoot.Controller;

import com.example.CrudSpringBoot.Entity.Student;
import com.example.CrudSpringBoot.Service.StudentService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Create Student //HTTP Request--> Post //End Point -->/api/students/create
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
//        System.out.println(student.getName()+student.getEmail());
        System.out.println("Inside Student Controller");
        Student createdStudent=studentService.createStudent(student);

        System.out.println("Existing Student Controller");
       return createdStudent ;

    }
    //Read Student//Read One//HTTp Request-->GET //End point -->/api/students/get/{id}
                  //Read All//SHttp Request -->GET//End point -->/api/students/getAll


    //Update Student //Update//Http Request-->PUT//Endpoint -->/api/students/update/{id}



    //Delete Student//Delete Student//Http Request-->DELETE//Endpoints-->/api/students/delete/{id}



}
