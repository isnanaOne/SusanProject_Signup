package com.susan.domain.entity;

public class User {
    private String id;
    private String password;
    private String address;
    private String name;
    private String phone;
    private int idType;

    public User(String id, String password, String address, String name, String phone, int idType) {
        this.id = id;
        this.password = password;
        this.address = address;
        this.name = name;
        this.phone = phone;
        this.idType = idType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }
}
