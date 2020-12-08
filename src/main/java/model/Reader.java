/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Quang Vinh
 */
public class Reader implements Serializable{
    private int id;
    private String name, address, phone;
    public static int currentId=9999;

    public Reader() {
    }

    public Reader(String name, String address, String phone) {
        this.id=++currentId;
        this.name = name;
        this.address = address;
        this.phone = phone;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        Reader.currentId = currentId;
    }
    public Object[] toObjects()
    {
        return new Object[]{id, name, address, phone};
    }
}
