package com.sbb.service;


import com.sbb.entity.Data;

import java.util.List;


public interface DataService{

    void saveData(Data data);
    List<Data> getData();

}