package com.example.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris Yang
 * created 2022-08-02 16:34
 **/

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping("/student")
    public String student(@RequestParam Integer num){
        Student student =  studentService.findStudent(num);
        return student.toString();
    }
}
