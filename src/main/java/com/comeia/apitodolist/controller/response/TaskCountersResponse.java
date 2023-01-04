package com.comeia.apitodolist.controller.response;

public class TaskCountersResponse {

    private Long qntTasks;

    private Long qntDoneTasks;

    private Long qntNotDoneTasks;

    public TaskCountersResponse(){}
    public TaskCountersResponse(Long qntTasks, Long qntDoneTasks, Long qntNotDoneTasks) {
        this.qntTasks = qntTasks;
        this.qntDoneTasks = qntDoneTasks;
        this.qntNotDoneTasks = qntNotDoneTasks;
    }

    public Long getQntTasks() {
        return qntTasks;
    }

    public void setQntTasks(Long qntTasks) {
        this.qntTasks = qntTasks;
    }

    public Long getQntDoneTasks() {
        return qntDoneTasks;
    }

    public void setQntDoneTasks(Long qntDoneTasks) {
        this.qntDoneTasks = qntDoneTasks;
    }

    public Long getQntNotDoneTasks() {
        return qntNotDoneTasks;
    }

    public void setQntNotDoneTasks(Long qntNotDoneTasks) {
        this.qntNotDoneTasks = qntNotDoneTasks;
    }
}
