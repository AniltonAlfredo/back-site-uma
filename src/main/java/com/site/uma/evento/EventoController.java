package com.site.uma.evento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/evento")
@CrossOrigin("http://localhost:3000/")
public class EventoController {
    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<EventoModel>> getAllEvento(){
        List<EventoModel> eventos=eventoService.listEvento();
        return new ResponseEntity<>(eventos, HttpStatus.OK);
    }

    @GetMapping("/lastsEvents")
    public ResponseEntity<?> getLastEvento(Pageable pageable){
        Page<EventoModel> eventos=eventoService.lisLastEvento(pageable);
        return new ResponseEntity<>(eventos, HttpStatus.OK);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<EventoModel> getEventoByCodigo(@PathVariable("codigo") Long codigo){
        EventoModel evento=eventoService.findEventoById(codigo);
        return  new ResponseEntity<>(evento, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<EventoModel> addEvento(@RequestBody EventoModel evento){
        EventoModel novoEvento=eventoService.addEvento(evento);
        return new ResponseEntity<>(novoEvento, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<EventoModel> updateEvento(@RequestBody EventoModel evento){
        EventoModel actualEvento=eventoService.updateEvento(evento);
        return new ResponseEntity<>(actualEvento,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public EventoModel deleteCurso(@RequestBody EventoModel evento){
        eventoService.deleteEvento(evento);
        return evento;
    }
}
