package com.aurum.fullstackdevelop.model;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.firestore.Document;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Document(collectionName = "cases")
public class Case {
    @DocumentId
    String id;
    String folder;
    List<Client> clients;
    String title;
    List<Tag> tags;
    String description;
    String note;
    String responsible;
    Acess acess;
    Date creationDate;
    String searchLowerCase;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public Acess getAcess() {
        return acess;
    }

    public void setAcess(Acess acess) {
        this.acess = acess;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getSearchLowerCase() {
        searchLowerCase = "".concat((getFolder()!=null?getFolder().toLowerCase().trim().concat(""):""))
                .concat((getTitle()!=null?getTitle().toLowerCase().trim().concat(""):""))
                .concat((getDescription()!=null?getDescription().toLowerCase().trim().concat(""):""));
        return searchLowerCase;
    }

    public void setSearchLowerCase(String searchLowerCase) {
        this.searchLowerCase = searchLowerCase;
    }
}
