package com.example.powerPoseTest.jungah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.powerPoseTest.jungah.dao.IJungahRepository;
import com.example.powerPoseTest.jungah.model.Jungah;

public class JungahService {
	   @Autowired
	    IJungahRepository jungahRepository;

	    public List<Jungah> getAllJungah() {
	        return jungahRepository.selectAllJungah();
	    }

	    public Jungah getAJungah(int id) {
	        return jungahRepository.selectBJungah(id);
	    }

	    public void insertJungah(String title, String context) {
	        jungahRepository.insertJungah(title, context);
	    }

	    public void updateJungah(int id, String title, String context) {
	        jungahRepository.updateJungah(id, title, context);
	    }

	   public void deleteJungah(int id) {
	        jungahRepository.deleteJungah(id);
	    }
}
