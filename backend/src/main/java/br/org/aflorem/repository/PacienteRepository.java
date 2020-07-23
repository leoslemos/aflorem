package br.org.aflorem.repository;

import br.org.aflorem.model.Paciente;
import org.springframework.data.repository.CrudRepository;

public interface PacienteRepository extends CrudRepository<Paciente, Integer> {
}
