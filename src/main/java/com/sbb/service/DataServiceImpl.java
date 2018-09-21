package com.sbb.service;


import com.sbb.entity.Data;
import com.sbb.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
class DataServiceImpl implements DataService{

    @Autowired
    DataRepository dataRepository;

    @Override
    public void saveData(Data data) {

        dataRepository.save(data);

    }

    @Override
    public List<Data> getData(){

        List<Data> dataList = dataRepository.findAll();

        return dataList;
    }


}