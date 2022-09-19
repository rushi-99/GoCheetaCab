/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rushi.bean;

/**
 *
 * @author admin
 */
public class VehicleBean {
    private int Id;
    private String ownerName;
    private String ownerContact;
    private String vehicleNumber;
    private String category;
    private String vehicleName;
    
    public VehicleBean(int Id, String ownerName,String ownerContact, String vehicleNumber, String category, String vehicleName){
        this.Id= Id;
        this.ownerName = ownerName;
        this.ownerContact = ownerContact;
        this.category = category;
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
        
    }
    
    public VehicleBean(){
        
    }
    
    public int getId(){
        return Id;
    }
    
    public void setId(int Id){
        this.Id = Id;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
     public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }
    
     public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    
    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
    
}
