package com.comeia.apitodolist.dto;

import java.util.Date;
import java.util.UUID;

public class TaskDTO {

    private String id;

    private Date dateToDoTask;

    private String description;

    private int taskDoneStatus;

    private Date createdAt;

    public TaskDTO(String id, Date dateToDoTask, String description, int taskDoneStatus, Date createdAt) {
        this.id = id;
        this.dateToDoTask = dateToDoTask;
        this.description = description;
        this.taskDoneStatus = taskDoneStatus;
        this.createdAt = createdAt;
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
