package com.example.springbootlearn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris Yang
 * created 2022-08-02 15:16
 **/

@RestController
public class PropertiesController {

    @Value("${school.grade}")
    Integer grade;

    @Value("${school.classNum}")
    Integer classNum;

    @GetMapping("/gradeClass")
    public String gradeClass() {
        return "年级：" + grade + "," + "班级：" + classNum;
    }
}
