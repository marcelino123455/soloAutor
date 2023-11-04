package com.example.demo.domain.entities;

import java.sql.Date;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;   
    private String editorial_name;    

    private Date fecha;

    public Autor() {
    }

    @PrePersist
    public void prePersist() {
        fecha = new Date(System.currentTimeMillis());
    }


}
