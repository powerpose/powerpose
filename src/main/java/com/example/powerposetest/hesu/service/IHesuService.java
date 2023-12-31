package com.example.powerposetest.hesu.service;

import com.example.powerposetest.hesu.model.Hesu;

import java.util.List;

public interface IHesuService {
    List<Hesu> getAllHesu();
    Hesu getAHesu(int id);
    void insertHesu(String title, String context);
    void updateHesu(int id,String title, String context);
    void deleteHesu(int id);

}
