package com.house4lease.hms.dataObject;

public class LoginDTO {
    private Integer phoneNumber;
    private String password;

    // Getters and setters
    public Integer getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(Integer phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
