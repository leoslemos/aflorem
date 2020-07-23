package br.org.aflorem.controller;

import br.org.aflorem.model.Endereco;
import br.org.aflorem.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/endereco")
public class EnderecoeController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping(path = "/adicionar")
    public @ResponseBody
    ResponseEntity<Endereco> novoEnderecoPaciente(@RequestBody Endereco endereco){
        try{
            Endereco novoEndereco = enderecoRepository.save(endereco);
            return new ResponseEntity<>(novoEndereco, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
