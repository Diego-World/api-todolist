package com.comeia.apitodolist.controller.response;

import com.comeia.apitodolist.dto.TaskDTO;

import java.util.List;

public class FindAllTaskResponse {

    private List<TaskDTO> content;

    public FindAllTaskResponse() {
    }

    public FindAllTaskResponse(List<TaskDTO> content) {
        this.content = content;
    }

    public List<TaskDTO> getContent() {
        return content;
    }

    public void setContent(List<TaskDTO> content) {
        this.content = content;
    }
}
