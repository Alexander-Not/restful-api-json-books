package com.mateusmr.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateusmr.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

}
