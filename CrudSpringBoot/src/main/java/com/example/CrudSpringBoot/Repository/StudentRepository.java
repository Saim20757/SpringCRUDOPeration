package com.example.CrudSpringBoot.Repository;

import com.example.CrudSpringBoot.Entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent (Student studentrReq){
        //Save To DB

        System.out.println("Inside Student Repository");
        System.out.println("Exiting Student Repository");

        Student s1=new Student();
        s1.setName("Saim");
        s1.setAge(29);
        s1.setEmail("saimnao@gmail.com");
        s1.setRollNumber(60);
        s1.setSubject("Biology");
        return s1;
    }
}
