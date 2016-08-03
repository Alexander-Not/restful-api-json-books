package com.mateusmr.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateusmr.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
