package com.quiz4.q4.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {

    @GetMapping(path = "/ping", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> get() {
        return Collections.singletonMap("ping", "pong");
    }

    @GetMapping(path = "/add/name/{name}/car/{car}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String get(@PathVariable String name,
                      @PathVariable String car) {
        return "Hello, " + name + " you have a cool " + car;
    }
}
