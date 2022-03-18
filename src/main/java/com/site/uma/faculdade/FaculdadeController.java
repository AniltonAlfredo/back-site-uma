package com.site.uma.faculdade;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculdade")
//@CrossOrigin("http://localhost:3000/")
public class FaculdadeController {
    private final FaculdadeService faculdadeService;

    public FaculdadeController(FaculdadeService faculdadeService){
        this.faculdadeService=faculdadeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<FaculdadeModel>> getAllFaculdade(){
        List<FaculdadeModel> faculdades=faculdadeService.listFaculdade();
        return new ResponseEntity<>(faculdades, HttpStatus.OK);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<FaculdadeModel> getFaculdadeByCodigo(@PathVariable("codigo") Long codigo){
        FaculdadeModel faculdade=faculdadeService.findFaculdadeByCodigo(codigo);
        return  new ResponseEntity<>(faculdade, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<FaculdadeModel> addFaculdade(@RequestBody FaculdadeModel faculdade){
        FaculdadeModel novaFaculdade=faculdadeService.addFaculdade(faculdade);
        return new ResponseEntity<>(novaFaculdade, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<FaculdadeModel> updateFaculdade(@RequestBody FaculdadeModel faculdade){
        FaculdadeModel actualFaculdade=faculdadeService.updateFaculdade(faculdade);
        return new ResponseEntity<>(actualFaculdade,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public FaculdadeModel deleteFaculdade(@RequestBody FaculdadeModel faculdade){
        faculdadeService.deleteFaculdade(faculdade);
        return faculdade;
    }


}

