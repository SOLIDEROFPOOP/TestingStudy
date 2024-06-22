package com.example.testdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TodoJunitTest {

    @Test
    public void shouldCreateNewTodo(){
        var test = new Todo("TEST", false);
        assertEquals("TEST",test.name(),"Todo name was not equal");
        assertFalse(test.completed());
    }
}
