package com.mateusmr.socialbooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateusmr.socialbooks.domain.Autor;
import com.mateusmr.socialbooks.repository.AutoresRepository;
import com.mateusmr.socialbooks.service.exceptions.AutorExistenteException;
import com.mateusmr.socialbooks.service.exceptions.AutorNaoEncontradoException;

@Service
public class AutoresService {

	@Autowired
	private AutoresRepository autoresRepository;

	public List<Autor> listar() {
		return autoresRepository.findAll();
	}

	public Autor salvar(Autor autor) {

		if (autor.getId() != null) {
			Autor a = autoresRepository.findOne(autor.getId());

			if (a != null) {
				throw new AutorExistenteException("O autor já existe");
			}
		}

		return autoresRepository.save(autor);
	}

	public Autor buscar(Long id) {

		Autor autor = autoresRepository.findOne(id);
		if (autor == null) {
			throw new AutorNaoEncontradoException("O autor não pôde ser encontrado.");
		}

		return autor;
	}
}
