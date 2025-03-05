package com.excel.kubernetes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubernetesController {

    @GetMapping("/message")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.status(HttpStatus.OK).body("This is Docker Image Page");
    }
}
