package com.site.uma.faculdade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FaculdadeService {
    private final FaculdadeRepository faculdadeRepository;

    @Autowired
    public FaculdadeService(FaculdadeRepository faculdadeRepository){
        this.faculdadeRepository=faculdadeRepository;
    }

    public FaculdadeModel addFaculdade(FaculdadeModel faculdade){
        return faculdadeRepository.save(faculdade);
    }

    public List<FaculdadeModel> listFaculdade(){
        return faculdadeRepository.findAll();
    }

    public FaculdadeModel updateFaculdade(FaculdadeModel faculdade){
        return faculdadeRepository.save(faculdade);
    }

    public FaculdadeModel findFaculdadeByCodigo(Long codigo) {
        return faculdadeRepository.findFaculdadeByCodigo(codigo).orElseThrow(
                () -> new UserNotFoundException("Faculdade "+codigo+" não foi encontrada"));
    }

    public void deleteFaculdade(@RequestBody FaculdadeModel faculdade){
        faculdadeRepository.delete(faculdade);
    }


}
