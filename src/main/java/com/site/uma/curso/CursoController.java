package com.site.uma.curso;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
@CrossOrigin("http://localhost:3000/")
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CursoModel>> getAllCursos(){
        List<CursoModel> cursos=cursoService.listCurso();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<CursoModel> getCursoByCodigo(@PathVariable("codigo") Long codigo){
        CursoModel curso=cursoService.findCursoByCodigo(codigo);
        return  new ResponseEntity<>(curso, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<CursoModel> addCurso(@RequestBody CursoModel curso){
        CursoModel novoCurso=cursoService.addCurso(curso);
        return new ResponseEntity<>(novoCurso, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<CursoModel> updateCurso(@RequestBody CursoModel curso){
        CursoModel actualCurso=cursoService.updateCurso(curso);
        return new ResponseEntity<>(actualCurso,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public CursoModel deleteCurso(@RequestBody CursoModel curso){
        cursoService.deleteCurso(curso);
        return curso;
    }

}
