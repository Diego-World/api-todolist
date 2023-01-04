package com.comeia.apitodolist.controller.response;

import com.comeia.apitodolist.model.Task;

public class CreateTaskResponse {

    private String message;

    private Task content;


    public CreateTaskResponse() {
    }

    public CreateTaskResponse(String message, Task content) {
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
