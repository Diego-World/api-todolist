package com.comeia.apitodolist.controller.request;

import java.util.Date;

public class CreateTaskRequest {
    private String dateToDoTask;

    private String description;

    private int taskDoneStatus;

    public String getDateToDoTask() {
        return dateToDoTask;
    }

    public void setDateToDoTask(String dateToDoTask) {
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
}
