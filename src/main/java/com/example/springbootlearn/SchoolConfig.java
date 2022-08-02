package com.example.springbootlearn;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置类
 * @author Chris Yang
 * created 2022-08-02 15:24
 **/

@Component
@ConfigurationProperties(prefix = "school")
public class SchoolConfig {
    Integer grade;
    Integer classNum;

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }
}
