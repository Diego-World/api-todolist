package com.comeia.apitodolist.controller.request;

public class UpdateTaskRequest {

    private String dateToDoTask;

    private String description;

    private int taskDoneStatus;

    public UpdateTaskRequest() {
    }

    public UpdateTaskRequest(String dateToDoTask, String description, int taskDoneStatus) {
        this.dateToDoTask = dateToDoTask;
        this.description = description;
        this.taskDoneStatus = taskDoneStatus;
    }

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
