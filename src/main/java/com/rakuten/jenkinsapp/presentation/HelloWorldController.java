package com.rakuten.jenkinsapp.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<?> sayHello() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> sayHello(@PathVariable String name) {
        return ResponseEntity.ok("Hello " + name);
    }
}
