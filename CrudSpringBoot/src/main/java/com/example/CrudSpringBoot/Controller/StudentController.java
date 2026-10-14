package com.example.CrudSpringBoot.Controller;

import com.example.CrudSpringBoot.Entity.Student;
import com.example.CrudSpringBoot.Service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

        Student createdStudent=studentService.createStudent(student);


       return createdStudent ;

    }
    //Read Student//Read One//HTTp Request-->GET //End point -->/api/students/get/{id}

    @PostMapping("/get/{id}")
    public  Student getStudent(@PathVariable Long id)
    {
     Student studentResp=studentService.getStudent(id);
        return studentResp;
    }
    //Read All//SHttp Request -->GET//End point -->/api/students/getAll
    @PostMapping("/getAll")
    public List<Student> getAllStudent()
    {
        List<Student> studentlist=studentService.getAllStudent();
        return studentlist;
    }



    //Update Student //Update//Http Request-->PUT//Endpoint -->/api/students/update/{id}



    //Delete Student//Delete Student//Http Request-->DELETE//Endpoints-->/api/students/delete/{id}



}
