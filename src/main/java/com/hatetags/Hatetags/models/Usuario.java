package com.hatetags.Hatetags.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Usuario {

    @Id
    @NotNull
    private Long id;

    @NotNull
    private Long id_usuario;

    @NotNull
    private String nm_usuario;

    @NotNull
    private String tag_usuario;

    private Long nr_seguidores;

    private Long nr_amigos;

    private String nm_idioma;

    private String nm_localizacao;

    private Long nr_tweets;

    @NotNull
    private String url_perfil;

    @NotNull
    private int sn_verificado;

    private int sn_tradutor;

    @NotNull
    private String nm_imagem;

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNm_usuario() {
        return nm_usuario;
    }

    public void setNm_usuario(String nm_usuario) {
        this.nm_usuario = nm_usuario;
    }

    public String getTag_usuario() {
        return tag_usuario;
    }

    public void setTag_usuario(String tag_usuario) {
        this.tag_usuario = tag_usuario;
    }

    public Long getNr_seguidores() {
        return nr_seguidores;
    }

    public void setNr_seguidores(Long nr_seguidores) {
        this.nr_seguidores = nr_seguidores;
    }

    public Long getNr_amigos() {
        return nr_amigos;
    }

    public void setNr_amigos(Long nr_amigos) {
        this.nr_amigos = nr_amigos;
    }

    public String getNm_idioma() {
        return nm_idioma;
    }

    public void setNm_idioma(String nm_idioma) {
        this.nm_idioma = nm_idioma;
    }

    public String getNm_localizacao() {
        return nm_localizacao;
    }

    public void setNm_localizacao(String nm_localizacao) {
        this.nm_localizacao = nm_localizacao;
    }

    public Long getNr_tweets() {
        return nr_tweets;
    }

    public void setNr_tweets(Long nr_tweets) {
        this.nr_tweets = nr_tweets;
    }

    public String getUrl_perfil() {
        return url_perfil;
    }

    public void setUrl_perfil(String url_perfil) {
        this.url_perfil = url_perfil;
    }

    public int getSn_verificado() {
        return sn_verificado;
    }

    public void setSn_verificado(int sn_verificado) {
        this.sn_verificado = sn_verificado;
    }

    public int getSn_tradutor() {
        return sn_tradutor;
    }

    public void setSn_tradutor(int sn_tradutor) {
        this.sn_tradutor = sn_tradutor;
    }

    public String getNm_imagem() {
        return nm_imagem;
    }

    public void setNm_imagem(String nm_imagem) {
        this.nm_imagem = nm_imagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
