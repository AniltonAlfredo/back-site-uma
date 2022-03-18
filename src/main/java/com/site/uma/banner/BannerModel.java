package com.site.uma.banner;

import javax.persistence.*;

@Entity
public class BannerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long codigo;
    @Column(nullable = false)
    public String img;
    @Column(nullable = true)
    public String link;

    public BannerModel(long codigo, String img, String link) {
        this.codigo = codigo;
        this.img = img;
        this.link = link;
    }

    public BannerModel() {
    }

    public BannerModel(long codigo, String img) {
        this.codigo = codigo;
        this.img = img;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
