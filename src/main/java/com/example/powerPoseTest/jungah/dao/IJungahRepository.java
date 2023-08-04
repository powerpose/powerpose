package com.example.powerPoseTest.jungah.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.powerPoseTest.hesu.model.Hesu;
import com.example.powerPoseTest.jungah.model.Jungah;

public interface IJungahRepository {
	  List<Jungah> selectAllJungah();

	    Jungah selectAJungah(@Param("id") int id);

	    void updateJungah(@Param("id") int id,@Param("title") String title, @Param("context") String context);

	    void deleteJungah(@Param("id") int id);

	    void insertJungah(@Param("title") String title, @Param("context") String context);
	}
