package com.tiago.work.controllers;

import com.tiago.work.modelos.Usuario;
import com.tiago.work.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
        List<Usuario> lista = usuarioService.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping(value = "/{id}")
    public  ResponseEntity<Usuario> findById(@PathVariable Long id){
        Usuario objeto = usuarioService.findById(id);
        return  ResponseEntity.ok(objeto);
    }
}
