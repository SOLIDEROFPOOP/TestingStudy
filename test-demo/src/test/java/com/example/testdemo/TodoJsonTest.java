package com.example.testdemo;

import com.jayway.jsonpath.JsonPath;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoJsonTest {
    @Test
    void shouldCompareJson() throws JSONException {
        var data = getRestData();
        var expected = """
                {
                    "todos" : [
                        {
                            "completed": true,
                            "name": "TEST 1"
                        },
                        {
                            "completed": true,
                            "name": "TEST 2"
                        }
                    ]
                }
                """;
        JSONAssert.assertEquals(expected , data , false);
    }
    @Test
    void shouldCompareJsonPath() {
        var json = """
                {
                    "todos" : [
                        {
                            "name": "TEST 1",
                            "completed": true
                        },
                        {
                            "name": "TEST 2",
                            "completed": true
                        }
                    ]
                }
                """;
        Integer length = JsonPath.read(json,"$.todos.length()");
        String name = JsonPath.read(json, "$.todos[1].name");
        assertEquals("TEST 2",name);
        assertEquals(2,length);
    }

    private String getRestData() {
        return """
                {
                    "todos" : [
                        {
                            "completed": true,
                            "name": "TEST 1"
                        },
                        {
                            "completed": true,
                            "name": "TEST 2"
                        }
                    ]
                }
                """;
    }
}
