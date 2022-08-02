package com.example.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Chris Yang
 * created 2022-08-02 16:35
 **/

@Service
public class StudentService {


    @Autowired
    StudentMapper studentMapper;

    public Student findStudent(Integer id) {
        return studentMapper.findById(id);
    }
}
