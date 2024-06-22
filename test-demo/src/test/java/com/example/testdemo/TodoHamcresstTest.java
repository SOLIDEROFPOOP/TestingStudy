package com.example.testdemo;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TodoHamcresstTest {

    @Test
    void shouldCreateNewTodo(){
        var test = new Todo("TEST", true);
        var test1 = new Todo("TEST",true);
        assertThat(test1,equalTo(test));
    }
}
