package com.comeia.apitodolist.repository;

import com.comeia.apitodolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, String> {
}
