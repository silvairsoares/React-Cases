package com.aurum.fullstackdevelop.model;

import com.google.cloud.firestore.annotation.DocumentId;
import org.springframework.cloud.gcp.data.firestore.Document;

//@Document(collectionName = "tags")
public class Tag {
//    @DocumentId
//    String id;
    String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
