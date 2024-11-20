package com.tiago.work.config;

import com.tiago.work.modelos.Usuario;
import com.tiago.work.repositoy.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public void run(String... args) throws Exception {
        Usuario usuario1 = new Usuario(null,"Roberta Martins","roberta@gmail.com","5198637564", "654321");
        Usuario usuario2 = new Usuario(null,"Lenadro Souza","leandro@gmail.com","5198690000", "123456");

        usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2));
    }
}
