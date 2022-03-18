package com.site.uma.faculdade;

import com.site.uma.curso.CursoModel;

import javax.persistence.*;
import java.util.List;

@Entity
public class FaculdadeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long codigo;
    @Column(nullable = false)
    public String nome;

    @Column(nullable = false)
    public String descricao;
    @OneToMany
    private List<CursoModel> curso;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descricao;
    }

    public void setDescrição(String descrição) {
        this.descricao = descrição;
    }

    public FaculdadeModel() {
    }

    public FaculdadeModel(Long codigo, String nome, String descrição) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descrição;
    }

    @Override
    public String toString() {
        return "FaculdadeModel{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", descrição='" + descricao + '\'' +
                '}';
    }
}
