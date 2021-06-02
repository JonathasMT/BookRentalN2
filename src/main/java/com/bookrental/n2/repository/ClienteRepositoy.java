package com.bookrental.n2.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookrental.n2.model.Cliente;

@Qualifier("cliente")
@Repository
public interface ClienteRepositoy extends CrudRepository<Cliente, String> {
	Cliente findById(int id);

}