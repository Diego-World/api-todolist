package com.comeia.apitodolist.service;

import com.comeia.apitodolist.controller.request.CreateTaskRequest;
import com.comeia.apitodolist.controller.request.UpdateTaskRequest;
import com.comeia.apitodolist.controller.response.CreateTaskResponse;
import com.comeia.apitodolist.controller.response.FindAllTaskResponse;
import com.comeia.apitodolist.controller.response.TaskCountersResponse;
import com.comeia.apitodolist.controller.response.UpdateTaskResponse;
import com.comeia.apitodolist.dto.TaskDTO;
import com.comeia.apitodolist.mapper.TaskMapper;
import com.comeia.apitodolist.model.Task;
import com.comeia.apitodolist.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private final TaskMapper taskMapper;

    private final TaskRepository taskRepository;

    public TaskService(TaskMapper taskMapper, TaskRepository taskRepository) {
        this.taskMapper = taskMapper;
        this.taskRepository = taskRepository;
    }


    public CreateTaskResponse create(CreateTaskRequest createTaskRequest) {
        Task task = new Task(
                Date.valueOf(createTaskRequest.getDateToDoTask()),
                createTaskRequest.getDescription(),
                createTaskRequest.getTaskDoneStatus(),
                UUID.randomUUID().toString()
        );

        taskRepository.save(task);

        return new CreateTaskResponse("Tarefa criada com sucesso!", task);
    }

    public UpdateTaskResponse update(String id, UpdateTaskRequest request) {
        Optional<Task> taskToUpdate = taskRepository.findById(id);

        UpdateTaskResponse response = new UpdateTaskResponse();

        taskToUpdate.ifPresentOrElse(task -> {
                    task.setDateToDoTask(Date.valueOf(request.getDateToDoTask()));
                    task.setDescription(request.getDescription());
                    task.setTaskDoneStatus(request.getTaskDoneStatus());
                    taskRepository.save(task);
                    response.setContent(task);
                    response.setMessage("Tarefa atualizada com sucesso!");
                },
                () -> {
                    response.setContent(null);
                    response.setMessage("Não foi possivel atualizar a tarefa");
                }
        );
        return response;
    }

    public Task findById(String id) {
        return taskRepository.findById(id).get();

    }

    public void delete(String id) {
        taskRepository.deleteById(id);
    }

    public FindAllTaskResponse findAll() {

        List<Task> taskList = taskRepository.findAll();

        List<TaskDTO> result = taskList.stream()
                .map(taskMapper::toDTO)
                .collect(Collectors.toList());

        return new FindAllTaskResponse(result);
    }

    public TaskCountersResponse getTaskCounters() {

        List<Task> taskList = taskRepository.findAll();

        Long qntTasks = (long) taskList.size();

        Long qntDoneTasks = taskList.stream().filter(task -> task.getTaskDoneStatus() == 1).count();

        Long qntNotDoneTasks = taskList.stream().filter(task -> task.getTaskDoneStatus() == 0).count();

        return new TaskCountersResponse(qntTasks, qntDoneTasks, qntNotDoneTasks);
    }
}
