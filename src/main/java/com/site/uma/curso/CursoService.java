package com.site.uma.curso;

import com.site.uma.faculdade.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    @Autowired
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }
    public CursoModel addCurso(CursoModel curso){
        return cursoRepository.save(curso);
    }
    public CursoModel updateCurso(CursoModel curso){
        return cursoRepository.save(curso);
    }
    public void deleteCurso(@RequestBody CursoModel curso){
         cursoRepository.delete(curso);
    }
    public List<CursoModel> listCurso(){
       return cursoRepository.findAll();
    }
    public CursoModel findCursoByCodigo(Long codigo) {
        return cursoRepository.findCursoByCodigo(codigo).orElseThrow(
                () -> new UserNotFoundException("Curso "+codigo+" não foi encontrada"));
    }

}
