package com.resuolve.app.services;

import java.util.List;

import com.resuolve.app.entity.Usuario;

public interface UsuarioService {
    
    public Usuario criaUsuario(String nome, String email, String senha, String telefone);

    public List<Usuario> buscarUsuarios();

}
