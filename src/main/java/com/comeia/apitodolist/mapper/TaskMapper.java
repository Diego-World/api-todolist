package com.comeia.apitodolist.mapper;

import com.comeia.apitodolist.dto.TaskDTO;
import com.comeia.apitodolist.model.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public TaskDTO toDTO(Task task) {
        return new TaskDTO(
                task.getId(),
                task.getDateToDoTask(),
                task.getDescription(),
                task.getTaskDoneStatus(),
                task.getCreatedAt()
        );
    }
}
