package com.yeahbutstill.repository.impl;

import com.yeahbutstill.entity.TodoList;
import com.yeahbutstill.repository.TodoListRepository;

public class TodoListRepositoryImpl implements TodoListRepository {

    private TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    @Override
    public void add(TodoList todoList) {
        
    }

    @Override
    public void remove(Integer number) {

    }
}
