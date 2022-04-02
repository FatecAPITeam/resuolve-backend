package com.resuolve.app.controllers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;
import com.resuolve.app.entity.Usuario;
import com.resuolve.app.services.UsuarioService;
import com.resuolve.app.JsonConfigure.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usService;
    
    @PostMapping(value = "/cadastrar")
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario){
        return usService.criaUsuario(usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getTelefone());
    }

    @GetMapping(value = "/listar")
    @JsonView(View.Usuario.class)
    public List<Usuario> buscarUsuarios(){
        return usService.buscarUsuarios();
    }
}
