package com.hcl.taskmanager.repositories;

import com.hcl.taskmanager.models.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
