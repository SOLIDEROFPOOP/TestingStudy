package com.example.testdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    private final TodoRepository todoRepository;
    @GetMapping("/api/todos")
    ResponseEntity<List<Todo>> findAll(){

    }
}
