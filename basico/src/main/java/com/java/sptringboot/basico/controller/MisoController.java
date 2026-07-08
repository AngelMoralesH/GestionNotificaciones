package com.java.sptringboot.basico.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MisoController {
    @GetMapping(path = "/hola")
    public ResponseEntity<String> miso(){
        return ResponseEntity.ok("holoLuis");
    }
}
