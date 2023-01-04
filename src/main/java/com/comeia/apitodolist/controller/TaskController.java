package com.comeia.apitodolist.controller;


import com.comeia.apitodolist.controller.request.CreateTaskRequest;
import com.comeia.apitodolist.controller.request.UpdateTaskRequest;
import com.comeia.apitodolist.controller.response.CreateTaskResponse;
import com.comeia.apitodolist.controller.response.FindAllTaskResponse;
import com.comeia.apitodolist.controller.response.TaskCountersResponse;
import com.comeia.apitodolist.controller.response.UpdateTaskResponse;
import com.comeia.apitodolist.model.Task;
import com.comeia.apitodolist.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public CreateTaskResponse create(@RequestBody CreateTaskRequest request){
        return service.create(request);
    }

    @PatchMapping("{id}")
    public UpdateTaskResponse update(@PathVariable(value = "id") String id, @RequestBody UpdateTaskRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable(value = "id") String id){
        service.delete(id);
    }

    @GetMapping("/all")
    public FindAllTaskResponse getAll(){
        return service.findAll();
    }

    @GetMapping("{id}")
    public Task getById(@PathVariable(value = "id") String id){
        return service.findById(id);
    }

    @GetMapping("/counters")
    public TaskCountersResponse getTaskCounters(){
        return service.getTaskCounters();
    }
}
