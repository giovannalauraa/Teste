package com.serotonina.serotoninaback.repository;

import org.springframework.data.repository.CrudRepository;

import com.serotonina.serotoninaback.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    
}
