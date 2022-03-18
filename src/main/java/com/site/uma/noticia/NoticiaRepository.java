package com.site.uma.noticia;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface NoticiaRepository extends PagingAndSortingRepository<NoticiaModel, Long> {
    Optional<NoticiaModel> findNoticiaByCodigo(Long Codigo);

}
