package com.example.jpa.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.jpa.repositories.DepartamentoRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) //Para que no intente generar el esquema en H2
class DepartamentoRepositoryTest {
	@Autowired
    DepartamentoRepository repository;
	
	@Test
	@DisplayName("findById")
	void testFindById() {
		assertEquals(60, repository.findById(60).get().getId());
	}

}
