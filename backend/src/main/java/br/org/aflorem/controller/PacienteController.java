package br.org.aflorem.controller;

import br.org.aflorem.model.Paciente;
import br.org.aflorem.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "/paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping(path = "/adicionar")
    public @ResponseBody
    ResponseEntity<Paciente> cadastrarPaciente(@RequestBody Paciente paciente){
        try{
            Paciente novoPaciente = pacienteRepository.save(paciente);
            return new ResponseEntity<>(novoPaciente, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
