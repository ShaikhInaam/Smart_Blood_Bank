package com.sbb.entity;


import com.sbb.dto.DataDTO;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@lombok.Data
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name,bloodGroup,phoneNumber,address,cnic;
    private Integer age;


    public Data(DataDTO data) {
        this.name = data.getName();
        this.bloodGroup = data.getBloodGroup();
        this.phoneNumber = data.getPhoneNumber();
        this.address = data.getAddress();
        this.cnic = data.getCnic();
        this.age = Integer.parseInt(data.getAge());

    }

}
