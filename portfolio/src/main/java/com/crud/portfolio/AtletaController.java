package com.crud.portfolio;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class AtletaController {

    AtletaRepository atletaRepository;

    @GetMapping("/atleta")
public List<Atleta> getAllAtleta(){
    return atletaRepository.findAll();

}

@GetMapping("/atleta/{id}")
public Atleta getAtletaById(@PathVariable Long id){
    return atletaRepository.findById(id).get();

}






}
