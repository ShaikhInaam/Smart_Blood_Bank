package com.sbb.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class DataDTO {


    private String name,bloodGroup,phoneNumber,address,cnic,age;



    public DataDTO(String name, String bloodGroup, String phoneNumber, String address, String cnic, String age) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.cnic = cnic;
        this.age = age;

   }

    public DataDTO(com.sbb.entity.Data data) {
        this.name = data.getName();
        this.bloodGroup = data.getBloodGroup();
        this.phoneNumber = data.getPhoneNumber();
        this.address = data.getAddress();
        this.cnic = data.getCnic();
        this.age = ""+data.getAge();

    }

}
