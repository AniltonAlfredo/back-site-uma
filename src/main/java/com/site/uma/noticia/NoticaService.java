package com.site.uma.noticia;

import com.site.uma.faculdade.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class NoticaService {
    private final NoticiaRepository noticiaRepository;
    @Autowired
    public NoticaService(NoticiaRepository noticiaRepository) {
        this.noticiaRepository = noticiaRepository;
    }
    public NoticiaModel addNoticia(NoticiaModel noticia){
        return noticiaRepository.save(noticia);
    }
    public NoticiaModel updateNoticia(NoticiaModel noticia){
        return noticiaRepository.save(noticia);
    }
    public void deleteNotica(@RequestBody NoticiaModel noticia){
        noticiaRepository.delete(noticia);
    }
    public List<NoticiaModel> listNoticia(){
        //return noticiaRepository.findAll();
        return (List<NoticiaModel>) noticiaRepository.findAll(Sort.by(Sort.Direction.DESC, "data"));
    }
    public Page<NoticiaModel> listDestaques(Pageable pageable){
        Sort sort = Sort.by(Sort.Direction.DESC,"destaque");
        pageable= PageRequest.of(0,3,sort);
        return  noticiaRepository.findAll(pageable);
    }
    public Page<NoticiaModel> listLast5(Pageable pageable){
        Sort sort = Sort.by(Sort.Direction.DESC,"data");
        pageable= PageRequest.of(0,5,sort);
        return  noticiaRepository.findAll(pageable);
    }
    public NoticiaModel findNoticiaById(Long codigo){
        return noticiaRepository.findNoticiaByCodigo(codigo).orElseThrow(
                () -> new UserNotFoundException("Noticia "+codigo+" não foi encontrada"));
    }
}
