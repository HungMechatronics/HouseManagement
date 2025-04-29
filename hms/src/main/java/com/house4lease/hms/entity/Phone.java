package com.house4lease.hms.entity;

import com.house4lease.hms.compositeKey.PhoneID;
import jakarta.persistence.*;
import org.hibernate.annotations.CurrentTimestamp;

@Entity(name = "phone")
@Table(name = "phonenumber")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pNumber")
    private Integer pNumber;

    @ManyToOne
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    private User user;

    public Integer getUserID() {
        return user != null ? user.getUserID() : null;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getPNumber() {
        return pNumber;
    }

    public void setPNumber(Integer pNumber) {
        this.pNumber = pNumber;
    }
}
