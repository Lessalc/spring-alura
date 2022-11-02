package com.lessalc.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lessalc.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);

}
