package com.example.powerPoseTest.jungah.service;

import java.util.List;

import com.example.powerPoseTest.jungah.model.Jungah;

public interface IJungahService {
	  List<Jungah> getAllJungah();
	    Jungah getAJungah(int id);
	    void insertJungah(String title, String context);
	    void updateJungah(int id,String title, String context);
	    void deleteJungah(int id);


}
