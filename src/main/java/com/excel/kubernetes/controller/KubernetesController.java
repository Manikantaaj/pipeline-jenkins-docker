package com.excel.kubernetes.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubernetesController {

    @Value("${spring.fileName}")
    private String name;

    @GetMapping("/message")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.status(HttpStatus.OK).body("This is Docker Image Page");
    }

    @GetMapping("/get")
    public ResponseEntity<String> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(name);
    }
}