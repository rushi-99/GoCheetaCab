/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rushi.bean;

/**
 *
 * @author admin
 */
public class DriverBean {
    private int Id;
    private String fullName;
    private String contactNumber;
    private String email;
    private String vehicleNumber;
    private String branch;
    private String address;
    
    public DriverBean(int Id, String fullName,String contactNumber, String email, String vehicleNumber, String branch, String address){
        this.Id= Id;
        this.fullName = fullName;
        this.address = address;
        this.branch = branch;
        this.contactNumber = contactNumber;
        this.email = email;
        this.vehicleNumber = vehicleNumber;
        
    }
    
    public DriverBean(){
        
    }
    
    public int getId(){
        return Id;
    }
    
    public void setId(int Id){
        this.Id = Id;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
     public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
