package com.yeahbutstill;

import com.yeahbutstill.repository.TodoListRepository;
import com.yeahbutstill.repository.impl.TodoListRepositoryImpl;
import com.yeahbutstill.service.TodoListService;
import com.yeahbutstill.service.impl.TodoListServiceImpl;
import com.yeahbutstill.view.TodoListView;

public class App {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }
}
