package com.aluno.aluno.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aluno.aluno.entities.Usuario;

@RepositoryRestResource(collectionResourceRel = "usuario", path = "usuario")
public interface UsuarioRepository extends PagingAndSortingRepository <Usuario, Integer>{

}
