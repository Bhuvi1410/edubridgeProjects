package com.example.project.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.Student.Student;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student, Integer>{

}
