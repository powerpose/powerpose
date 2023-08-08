package com.example.powerPoseTest.jungah.service;

import java.util.List;

import com.example.powerPoseTest.jungah.model.Jj;

public interface IJjService {
	 List<Jj> selectAllJj(); 
	Jj view(int id);
	 void insertJj(String title, String context);
	 void updateJj(int id,String title, String context);
	 void delete(int id);

}
