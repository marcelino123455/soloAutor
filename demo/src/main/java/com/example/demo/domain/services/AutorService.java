package com.example.demo.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.entities.Autor;
import com.example.demo.repository.AutorRepository;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public Autor saveAutor(Autor autor){
        return autorRepository.save(autor);
    }

    public List<Autor> getAllAutors(){
        return autorRepository.findAll();
    }

    public Optional<Autor> getOneAutor(Long id){
        return autorRepository.findById(id);
    }





    
}
