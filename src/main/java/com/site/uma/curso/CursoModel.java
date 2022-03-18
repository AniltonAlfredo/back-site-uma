package com.site.uma.curso;

import com.site.uma.faculdade.FaculdadeModel;

import javax.persistence.*;

@Entity
public class CursoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long codigo;
    @Column(nullable = false)
    public String nome;
    @Column(nullable = false)
    public short duracao;
    @Column
    public String descricao;
    @Column
    public String saida;
    @Column
    public String planoCurricular;
    @Column
    public float mensalidade;
    @ManyToOne
    private FaculdadeModel faculdade;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getDuracao() {
        return duracao;
    }

    public void setDuracao(short duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public String getPlanoCurricular() {
        return planoCurricular;
    }

    public void setPlanoCurricular(String planoCurricular) {
        this.planoCurricular = planoCurricular;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public FaculdadeModel getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(FaculdadeModel faculdade) {
        this.faculdade = faculdade;
    }

    public CursoModel(long codigo, String nome, short duracao, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
        this.descricao = descricao;
    }

    public CursoModel(long codigo, String nome, short duracao, String descricao, String saida, String planoCurricular, float mensalidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
        this.descricao = descricao;
        this.saida = saida;
        this.planoCurricular = planoCurricular;
        this.mensalidade = mensalidade;
    }

    public CursoModel() {
    }

    @Override
    public String toString() {
        return "CursoModel{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", descricao='" + descricao + '\'' +
                ", saida='" + saida + '\'' +
                ", planoCurricular='" + planoCurricular + '\'' +
                ", mensalidade=" + mensalidade +
                '}';
    }
}
