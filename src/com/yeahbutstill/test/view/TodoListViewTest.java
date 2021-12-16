package com.yeahbutstill.test.view;

import com.yeahbutstill.repository.TodoListRepository;
import com.yeahbutstill.repository.impl.TodoListRepositoryImpl;
import com.yeahbutstill.service.TodoListService;
import com.yeahbutstill.service.impl.TodoListServiceImpl;
import com.yeahbutstill.view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        testViewShowTodoList();
    }

    public static void testViewShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Class");

        todoListView.showTodoList();
    }
}