package com.example.CrudSpringBoot.Repository;

import com.example.CrudSpringBoot.Entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent (Student studentrReq){
        //Save To DB

        System.out.println("Inside Repository");
        return null;
    }
}
