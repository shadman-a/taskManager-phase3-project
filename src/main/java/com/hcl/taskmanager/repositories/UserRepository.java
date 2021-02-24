package com.hcl.taskmanager.repositories;

import com.hcl.taskmanager.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    public User findUserByUsername(String name);
}
