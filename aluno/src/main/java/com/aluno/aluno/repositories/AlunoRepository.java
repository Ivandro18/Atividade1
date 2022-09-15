package com.aluno.aluno.repositories;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aluno.aluno.entities.Aluno;

import org.springframework.data.repository.PagingAndSortingRepository;

@RepositoryRestResource(collectionResourceRel = "aluno", path = "aluno")
public interface AlunoRepository extends PagingAndSortingRepository <Aluno, Integer>{

}
