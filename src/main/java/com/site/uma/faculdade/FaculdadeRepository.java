package com.site.uma.faculdade;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FaculdadeRepository extends JpaRepository<FaculdadeModel, Long> {
    Optional<FaculdadeModel> findFaculdadeByCodigo(Long Codigo);
}
