package com.house4lease.hms.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Thís class is created to store the data we read
// from the MongoDB database
@Document(collection = "room")
// When Annotation Data is not working, you can use Get, Set instead
@Data
public class Room {
    @Id
    public ObjectId _id;

    public Integer roomNumber;
    public Double price;
    public Double size;
    public Boolean avail;
    public String picture;

}
