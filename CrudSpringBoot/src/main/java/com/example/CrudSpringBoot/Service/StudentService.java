package com.example.CrudSpringBoot.Service;

import com.example.CrudSpringBoot.Entity.Student;
import com.example.CrudSpringBoot.Repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentreq){
      //Store To db
        // Business logic


    Student studentres =studentRepository.save(studentreq);

    return  studentres;
    }
    public Student getStudent(Long id){
        Optional<Student> studentResp=studentRepository.findById(id);
        if (studentResp.isPresent()){
            return studentResp.get();
        }
        return null;

    }
    public List<Student> getAllStudent(){
        List<Student> studentList=studentRepository.findAll();
        return studentList;

    }




}
