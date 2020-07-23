package br.org.aflorem.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @Column(name = "id_endereco")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEndereco;
    private String cidade;

    public Endereco() {
    }

    public Endereco(String cidade){
        this.cidade = cidade;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
