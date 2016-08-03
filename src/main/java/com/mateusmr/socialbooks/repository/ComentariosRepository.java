package com.mateusmr.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateusmr.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
