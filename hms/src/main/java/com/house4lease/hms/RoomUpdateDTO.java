package com.house4lease.hms;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


//@Setter
//@Getter
//@Data
public class RoomUpdateDTO {
    // Getter and Setter for roomNumber
    private Integer roomNumber;
    // Getter and Setter for price
    private Double price;
    // Getter and Setter for size
    private Double size;
    // Getter and Setter for avail
    private Boolean avail;
    // Getter and Setter for picture
    private String picture;

    public RoomUpdateDTO() {
    }

    public RoomUpdateDTO(Integer roomNumber, Double price, Double size, Boolean avail, String picture) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.size = size;
        this.avail = avail;
        this.picture = picture;
    }

    // Temporary used since annotation is not working

    // Getter and Setter for roomNumber
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    // Getter and Setter for price
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Getter and Setter for size
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    // Getter and Setter for avail
    public Boolean getAvail() {
        return avail;
    }

    public void setAvail(Boolean avail) {
        this.avail = avail;
    }

    // Getter and Setter for picture
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
