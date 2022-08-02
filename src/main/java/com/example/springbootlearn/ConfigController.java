package com.example.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris Yang
 * created 2022-08-02 15:25
 **/

@RestController
public class ConfigController {

    @Autowired
    SchoolConfig schoolConfig;

    @GetMapping("/gradefromconfig")
    public String gradeclass(){
        return "年级：" + schoolConfig.grade + "," + "班级：" + schoolConfig.classNum;
    }
}
