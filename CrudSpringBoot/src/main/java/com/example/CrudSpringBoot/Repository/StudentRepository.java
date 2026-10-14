package com.example.CrudSpringBoot.Repository;

import com.example.CrudSpringBoot.Entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    //Save To DB/
//        Methods
//        Create -->save()-->Insert into the table
//        Read All-->findAll()-->Select* from the table
//        Read One-->find()-->select * from where
//        Delete-->DeleteByID()
//         Update-->Save()
//                 --.ExistByID()
}

