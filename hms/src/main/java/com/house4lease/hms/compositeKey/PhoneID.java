package com.house4lease.hms.compositeKey;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PhoneID implements Serializable {

    @Column(name = "userID")
    private Integer userID;

    @Column(name = "pNumber")
    private Integer pNumber;

    // Getter và Setter
    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getPNumber() {
        return pNumber;
    }

    public void setPNumber(Integer pNumber) {
        this.pNumber = pNumber;
    }

    // Override equals() và hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneID)) return false;
        PhoneID phoneId = (PhoneID) o;
        return Objects.equals(userID, phoneId.userID) &&
                Objects.equals(pNumber, phoneId.pNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, pNumber);
    }
}

