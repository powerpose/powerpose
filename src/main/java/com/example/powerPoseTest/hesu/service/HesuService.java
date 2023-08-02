package com.example.powerPoseTest.hesu.service;

import com.example.powerPoseTest.hesu.dao.IHesuRepository;
import com.example.powerPoseTest.hesu.model.Hesu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HesuService implements IHesuService {
    @Autowired
    IHesuRepository hesuRepository;

    @Override
    public List<Hesu> getAllHesu() {
        return hesuRepository.selectAllHesu();
    }

    @Override
    public Hesu getAHesu(int id) {
        return hesuRepository.selectAHesu(id);
    }

    @Override
    public void insertHesu(String title, String context) {
        hesuRepository.insertHesu(title, context);
    }

    @Override
    public void updateHesu(int id, String title, String context) {
        hesuRepository.updateHesu(id, title, context);
    }

    @Override
    public void deleteHesu(int id) {
        hesuRepository.deleteHesu(id);
    }
}
