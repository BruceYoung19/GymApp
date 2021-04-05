package com.example.gymapplication;

public class trainer {

    private String name,desc,speciality;

    public trainer(String name, String desc, String speciality){
        this.name = name;
        this.desc = desc;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // TODO: 5/04/21  Time slot for the trainer
}


