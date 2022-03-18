package com.site.uma.noticia;


import javax.persistence.*;
import java.util.Date;

@Entity
public class NoticiaModel {
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
    @Column
    public String img;
    @Column
    public Boolean destaque;



    public NoticiaModel(long codigo, String titulo, String descricao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public NoticiaModel(long codigo, String titulo, String resumo, Date data, String descricao, String tag, String img) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.resumo = resumo;
        this.data = data;
        this.descricao = descricao;
        this.tag = tag;
        this.img = img;
    }

    public NoticiaModel() {
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
    public Boolean getDestaque() {
        return destaque;
    }

    public void setDestaque(Boolean destaque) {
        this.destaque = destaque;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }



    @Override
    public String toString() {
        return "NoticiaModel{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", resumo='" + resumo + '\'' +
                ", data=" + data +
                ", descricao='" + descricao + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
