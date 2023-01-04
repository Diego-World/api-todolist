package com.comeia.apitodolist.controller.response;

import com.comeia.apitodolist.model.Task;

public class UpdateTaskResponse {

    private String message;

    private Task content;

    public UpdateTaskResponse() {
    }

    public UpdateTaskResponse(String message, Task content) {
        this.message = message;
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Task getContent() {
        return content;
    }

    public void setContent(Task content) {
        this.content = content;
    }
}

