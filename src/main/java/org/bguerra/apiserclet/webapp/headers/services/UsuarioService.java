package org.bguerra.apiserclet.webapp.headers.services;

import org.bguerra.apiserclet.webapp.headers.models.entities.Usuario;

import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> login(String username, String password);
}
