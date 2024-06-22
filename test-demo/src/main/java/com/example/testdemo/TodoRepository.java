package com.example.testdemo;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class TodoRepository {
    List<Todo> todos = new ArrayList<>();

    public TodoRepository(){
        todos = List.of(new Todo("test 1 ", true), new Todo("test 2", true));

    }
    public List<Todo> findAll(){
        return todos;
    }
}
