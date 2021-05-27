package com.bookrental.n2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookrental.n2.model.Livro;

@Repository
public interface BibliotecaRepository extends CrudRepository<Livro, String> {
	Livro findById(int id);

}