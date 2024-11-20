package com.tiago.work.controllers;

import com.tiago.work.modelos.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioRecurso {
    @GetMapping
    public ResponseEntity<Usuario> findAll(){
        Usuario usuario1 = new Usuario(1L, "Alisson", "alison@gmail.com", "219857645", "123");
        return ResponseEntity.ok(usuario1);
    }
}
