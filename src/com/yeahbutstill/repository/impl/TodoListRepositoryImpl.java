package com.yeahbutstill.repository.impl;

import com.yeahbutstill.entity.TodoList;
import com.yeahbutstill.repository.TodoListRepository;

public class TodoListRepositoryImpl implements TodoListRepository {

    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    public boolean isFull() {
        // Check apakah model penuh?
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                // kalau datanya masih ada yang kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void reSizeIfFull() {
        // Jika penuh, rieze ukuran array 2x lipat
        if (isFull()) {
            var temp = data;
            data = new TodoList[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(TodoList todoList) {

        reSizeIfFull();

        // Tambahkan ke posisi yang data array nya Null
        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todoList;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if (data.length <= (number - 1)) {
            return false;
        } else if (data[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < data.length; i++) {
                if (i == (data.length - 1)) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
            return true;
        }
    }
}
