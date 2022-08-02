package com.example.springbootlearn;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 学生mapper
 * @author Chris Yang
 * created 2022-08-02 16:35
 **/


@Mapper
@Repository
public interface StudentMapper {

    @Select("select * from students where id = #{id}")
    Student findById(Integer id);
}
