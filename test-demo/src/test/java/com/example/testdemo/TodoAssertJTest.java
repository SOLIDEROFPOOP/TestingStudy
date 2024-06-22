package com.example.testdemo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoAssertJTest {

    @Test
    void shouldCreateNewTodo(){
        var test = new Todo("TEST",true);
        assertThat(test.name())
                .startsWith("T")
                .endsWith("T")
                .containsIgnoringCase("es")
                .isEqualToIgnoringCase("TEST");
    }
}
