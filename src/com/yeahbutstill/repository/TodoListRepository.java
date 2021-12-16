package com.yeahbutstill.repository;

import com.yeahbutstill.entity.TodoList;

public interface TodoListRepository {

    TodoList[] getAll();

    void add(TodoList todoList);

    boolean remove(Integer number);

}
