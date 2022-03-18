package com.site.uma.evento;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface EventoRepository extends PagingAndSortingRepository<EventoModel, Long> {
    Optional<EventoModel> findEventoByCodigo(Long codigo);
}

