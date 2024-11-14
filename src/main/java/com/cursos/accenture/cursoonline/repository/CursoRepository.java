package com.cursos.accenture.cursoonline.repository;

import com.cursos.accenture.cursoonline.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
