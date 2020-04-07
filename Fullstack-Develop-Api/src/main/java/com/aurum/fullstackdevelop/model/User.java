package com.aurum.fullstackdevelop.model;


import com.google.cloud.firestore.annotation.DocumentId;
import org.springframework.cloud.gcp.data.firestore.Document;
import org.springframework.data.annotation.Id;

@Document(collectionName = "users")
public class User {
    @DocumentId
    String ref;
    String name;
    int age;

    public User() {
    }

    public User(String ref, String name, int age) {
        this.ref = ref;
        this.name = name;
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
