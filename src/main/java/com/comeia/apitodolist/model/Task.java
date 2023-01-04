package com.comeia.apitodolist.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "Task")
public class Task {

    @Id
    private String id;

    @Column(nullable = false)
    private Date dateToDoTask;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int taskDoneStatus;

    @CreationTimestamp
    private Date createdAt;

    public Task(){}

    public Task(Date dateToDoTask, String description, int taskDoneStatus, String id) {
        this.dateToDoTask = dateToDoTask;
        this.description = description;
        this.taskDoneStatus = taskDoneStatus;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateToDoTask() {
        return dateToDoTask;
    }

    public void setDateToDoTask(Date dateToDoTask) {
        this.dateToDoTask = dateToDoTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTaskDoneStatus() {
        return taskDoneStatus;
    }

    public void setTaskDoneStatus(int taskDoneStatus) {
        this.taskDoneStatus = taskDoneStatus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
