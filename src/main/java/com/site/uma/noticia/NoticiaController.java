package com.site.uma.noticia;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/noticia")
//@CrossOrigin("http://localhost:3000/")
public class NoticiaController {

    private final NoticaService noticaService;

    public NoticiaController(NoticaService noticaService) {
        this.noticaService = noticaService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllNoticias(){
        List<NoticiaModel> noticias=noticaService.listNoticia();
        return new ResponseEntity<>(noticias, HttpStatus.OK);
    }
    @GetMapping("/destaques")
    public ResponseEntity<?> getDestaques(Pageable pageable){
        Page<NoticiaModel> noticias= noticaService.listDestaques(pageable);
        return new ResponseEntity<>(noticias, HttpStatus.OK);
    }
    @GetMapping("/listLast5")
    public ResponseEntity<?> getLast5(Pageable pageable){
        Page<NoticiaModel> noticias= noticaService.listLast5(pageable);
        return new ResponseEntity<>(noticias, HttpStatus.OK);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<NoticiaModel> getNoticiaByCodigo(@PathVariable("codigo") Long codigo){
        NoticiaModel noticia=noticaService.findNoticiaById(codigo);
        return  new ResponseEntity<>(noticia, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<NoticiaModel> addCurso(@RequestBody NoticiaModel noticia){
        NoticiaModel novaNoticia= noticaService.addNoticia(noticia);
        return new ResponseEntity<>(novaNoticia, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<NoticiaModel> updateNoticia(@RequestBody NoticiaModel noticia){
        NoticiaModel actualNoticia=noticaService.updateNoticia(noticia);
        return new ResponseEntity<>(actualNoticia,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public NoticiaModel deleteCurso(@RequestBody NoticiaModel noticia){
        noticaService.deleteNotica(noticia);
        return noticia;
    }


}
