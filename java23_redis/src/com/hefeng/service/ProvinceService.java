package com.hefeng.service;

import com.hefeng.domain.Province;

import java.util.List;

public interface ProvinceService {
    public List<Province> findAll();

    public String findAllJson();

}
