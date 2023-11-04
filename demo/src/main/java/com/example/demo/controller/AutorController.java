package com.example.demo.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.entities.Autor;
import com.example.demo.domain.services.AutorService;

@RestController
@RequestMapping("/autor")
@CrossOrigin("*")
public class AutorController {
    
    @Autowired
    private AutorService autorService;

    @GetMapping
    public ResponseEntity<List<Autor>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(autorService.getAllAutors());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> getOne(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(autorService.getOneAutor(id).get());
    }

    @PostMapping
    public ResponseEntity<String> saveOne(@RequestBody Autor autor){
        autorService.saveAutor(autor);
        return ResponseEntity.status(HttpStatus.OK).body("Autor añadido Correctamente");
    }

}
