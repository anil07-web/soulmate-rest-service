package com.stackroute.SoulmateRESTservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
    @Id
    private int id;
    private String name;
    private String gender;
    private String age;

    public Profile() {
    }

    public Profile(int id, String name, String gender, String age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
