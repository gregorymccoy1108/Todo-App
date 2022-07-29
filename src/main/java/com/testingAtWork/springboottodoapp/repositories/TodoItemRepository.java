package com.testingAtWork.springboottodoapp.repositories;

import com.testingAtWork.springboottodoapp.models.TodoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
