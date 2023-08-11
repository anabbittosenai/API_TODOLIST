package br.com.todolist;

import jakarta.persistence.*;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(length = 100, nullable = false)
    private String Title;

    @Column(length = 255, nullable = false)
    private String Decription;

    @Column(nullable = false)
    private StatusEnum Status = StatusEnum.NOT_STARTED;

    public Todo(Integer id, String title, String decription, StatusEnum status) {
        Id = id;
        Title = title;
        Decription = decription;
        Status = status;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDecription() {
        return Decription;
    }

    public void setDecription(String decription) {
        Decription = decription;
    }

    public StatusEnum getStatus() {
        return Status;
    }

    public void setStatus(StatusEnum status) {
        Status = status;
    }
}
