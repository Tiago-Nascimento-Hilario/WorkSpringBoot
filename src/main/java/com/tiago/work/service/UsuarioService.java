package com.tiago.work.service;

import com.tiago.work.modelos.Usuario;
import com.tiago.work.repositoy.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }
    public Usuario findById(Long id){
        Optional<Usuario> objeto = usuarioRepository.findById(id);
        return objeto.get();
    }
}
