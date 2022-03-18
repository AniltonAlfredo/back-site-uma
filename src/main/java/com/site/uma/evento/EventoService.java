package com.site.uma.evento;

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
public class EventoService {
    private final EventoRepository eventoRepository;

    @Autowired
    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public EventoModel addEvento(EventoModel evento){
        return eventoRepository.save(evento);
    }

    public EventoModel updateEvento(EventoModel evento){
        return eventoRepository.save(evento);
    }

    public void deleteEvento(@RequestBody EventoModel evento){
        eventoRepository.delete(evento);
    }

    public List<EventoModel> listEvento(){
        return (List<EventoModel>) eventoRepository.findAll();
    }
    public Page<EventoModel> lisLastEvento(Pageable pageable){
        Sort sort = Sort.by(Sort.Direction.DESC,"data");
        pageable= PageRequest.of(0,4,sort);
        return  eventoRepository.findAll(pageable);
    }
    public EventoModel findEventoById(Long codigo){
        return eventoRepository.findEventoByCodigo(codigo).orElseThrow(
                () -> new UserNotFoundException("Evento "+codigo+" não foi encontrada"));
    }
}
