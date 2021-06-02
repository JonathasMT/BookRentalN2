package com.bookrental.n2.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookrental.n2.model.Livro;

@Qualifier("livro")
@Repository
public interface LivroRepository extends CrudRepository<Livro, String> {
	Livro findById(int id);

}