package br.org.aflorem.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @Column(name = "id_paciente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;
    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "paciente_endereco",
            joinColumns = @JoinColumn(name = "id_paciente"),
            inverseJoinColumns = @JoinColumn(name = "id_endereco")
    )
    private Set<Endereco> enderecos;

    public Paciente() {
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
