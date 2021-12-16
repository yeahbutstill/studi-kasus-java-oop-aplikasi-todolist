package com.yeahbutstill.service.impl;

import com.yeahbutstill.entity.TodoList;
import com.yeahbutstill.repository.TodoListRepository;
import com.yeahbutstill.service.TodoListService;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        System.out.println("TODOLIST");
        TodoList[] model = todoListRepository.getAll();
        for (var i = 0; i < model.length; i++) {
            var todoList = model[i];
            var no = i + 1;

            if (todoList != null) {
                System.out.println(no + ". " + todoList.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {

    }

    @Override
    public void removeTodoList(Integer number) {

    }
}
