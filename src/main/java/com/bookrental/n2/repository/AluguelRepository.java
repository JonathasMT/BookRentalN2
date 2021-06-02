package com.bookrental.n2.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookrental.n2.model.Aluguel;

@Qualifier("aluguel")
@Repository
public interface AluguelRepository extends CrudRepository<Aluguel, String> {
	Aluguel findById(int id);

}
