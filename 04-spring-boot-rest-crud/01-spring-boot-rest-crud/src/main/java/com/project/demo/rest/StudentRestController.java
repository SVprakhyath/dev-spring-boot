package com.project.demo.rest;

import com.project.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<Student>();
        theStudents.add(new Student("Sundaragiri","Prakhyath"));
        theStudents.add(new Student("Annaldas","Sai teja"));
        theStudents.add(new Student("Arram","Sowmith"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if((studentId >= theStudents.size()) || (studentId<0)){
            throw new StudentNotFoundExecption("student id not found"+ studentId);
        }
        return theStudents.get(studentId);
    }


}
