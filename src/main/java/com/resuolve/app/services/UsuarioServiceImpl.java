package com.resuolve.app.services;

import java.util.List;

import com.resuolve.app.entity.Usuario;
import com.resuolve.app.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.stereotype.Service;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Autowired
    private PasswordEncoder passEncoder;

    @Override
    public Usuario criaUsuario(String nome, String email, String senha, String telefone) {

        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(passEncoder.encode(senha));
        usuario.setTelefone(telefone);

        usuarioRepo.save(usuario);
        return usuario;
    }

    @Override
    public List<Usuario> buscarUsuarios() {
        return usuarioRepo.findAll();
    }

}
