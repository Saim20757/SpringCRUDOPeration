package com.example.CrudSpringBoot.Repository;

import com.example.CrudSpringBoot.Entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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
    Optional<Student> findByIdAndDeletedIsFalse(Long id);
    List<Student> findByDeletedIsFalse();


}

