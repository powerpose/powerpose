package com.example.powerPoseTest.jungah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.powerPoseTest.jungah.dao.IJjRepository;
import com.example.powerPoseTest.jungah.model.Jj;

@Service
public class JjService implements IJjService {

	@Autowired
	IJjRepository jjRepository;

	  public List<Jj> selectAllJj() {
		  return jjRepository.selectAllJj(); }
	 
	 @Override public Jj view(int id) {
		 return jjRepository.view(id); }

	 @Override
	    public void insertJj(String title, String context) {
	        jjRepository.insertJj(title, context);
	    }
	
	 @Override
	    public void updateJj(int id, String title, String context) {
	        jjRepository.updateJj(id, title, context);
	    }
	    
	  @Override
	    public void delete(int id) {
	        jjRepository.delete(id);
	    }
}
