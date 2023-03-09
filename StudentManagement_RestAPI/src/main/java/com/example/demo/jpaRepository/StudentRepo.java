package com.example.demo.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.studentClass.Students;

//This Interface extends JpaRepository interface, so that @Repository is not needed to be annotated manually
@org.springframework.stereotype.Repository
public interface StudentRepo extends JpaRepository<Students, Integer>{

}
