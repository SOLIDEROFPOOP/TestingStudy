package com.example.testdemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import java.util.List;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TodoController.class)
public class TodoControllerTest {
    @Autowired
    MockMvc mockMvc;
    @MockBean
    TodoRepository todoRepository;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void shouldFindAllTodos() throws Exception {
        var list = List.of(new Todo("test 1 ", true), new Todo("test 2", true));
        Mockito.when(todoRepository.findAll()).thenReturn(list);
        mockMvc.perform(get("/api/todos"))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(list)));
    }
}
