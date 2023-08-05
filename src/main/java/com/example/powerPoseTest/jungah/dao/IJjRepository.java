package com.example.powerPoseTest.jungah.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.powerPoseTest.jungah.model.Jj;


@Mapper
@Repository
public interface IJjRepository {
   List<Jj> selectAllJj();
   Jj view (int id);
   void insertJj(@Param("title") String title, @Param("context") String context);
 void updateJj(@Param("id") int id,@Param("title") String title, @Param("context") String context);
 void deleteJj(@Param("id") int id);

}
