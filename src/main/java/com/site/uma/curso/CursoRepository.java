package com.site.uma.curso;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursoRepository extends JpaRepository<CursoModel, Long> {
    Optional<CursoModel> findCursoByCodigo(Long Codigo);
}
