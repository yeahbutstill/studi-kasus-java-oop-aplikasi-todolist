package com.yeahbutstill.test.service;

import com.yeahbutstill.entity.TodoList;
import com.yeahbutstill.repository.impl.TodoListRepositoryImpl;
import com.yeahbutstill.service.TodoListService;
import com.yeahbutstill.service.impl.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testShowTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Belajar Java Dasar");
        todoListRepository.data[1] = new TodoList("Belajar Java OOP");
        todoListRepository.data[2] = new TodoList("Belajar Java Standard Class");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }
}
