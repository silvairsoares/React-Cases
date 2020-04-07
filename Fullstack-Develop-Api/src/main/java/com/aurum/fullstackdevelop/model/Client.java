package com.aurum.fullstackdevelop.model;

import com.google.cloud.firestore.annotation.DocumentId;
import org.springframework.cloud.gcp.data.firestore.Document;


//@Document(collectionName = "clients")
public class Client {
//    @DocumentId
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
