package com.site.uma.evento;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EventoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long codigo;
    @Column(nullable = false)
    public String titulo;
    @Column(nullable = false)
    public String resumo;
    @Column
    public Date data;
    @Column
    public String descricao;
    @Column
    public String tag;

    public EventoModel(long codigo, String titulo, String resumo, Date data, String tag) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.resumo = resumo;
        this.data = data;
        this.tag = tag;
    }

    public EventoModel() {
    }

    public EventoModel(long codigo, String titulo, String resumo, Date data) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.resumo = resumo;
        this.data = data;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }



    @Override
    public String toString() {
        return "EventoModel{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", resumo='" + resumo + '\'' +
                ", data=" + data +
                ", descricao='" + descricao + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
