package com.hatetags.Hatetags.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Tweet {

    @Id
    @NotNull
    private Long id;

    @NotNull
    private Long id_usuario;

    @NotNull
    private Long id_tweet;

    @NotNull
    private String ds_tweet;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dh_tweet;

    private Long qt_favoritos;

    private Long qt_retweets;

    private int sn_retweet;

    public Long getId_tweet() {
        return id_tweet;
    }

    public void setId_tweet(Long id_tweet) {
        this.id_tweet = id_tweet;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDs_tweet() {
        return ds_tweet;
    }

    public void setDs_tweet(String ds_tweet) {
        this.ds_tweet = ds_tweet;
    }

    public Date getDh_tweet() {
        return dh_tweet;
    }

    public void setDh_tweet(Date dh_tweet) {
        this.dh_tweet = dh_tweet;
    }

    public Long getQt_favoritos() {
        return qt_favoritos;
    }

    public void setQt_favoritos(Long qt_favoritos) {
        this.qt_favoritos = qt_favoritos;
    }

    public Long getQt_retweets() {
        return qt_retweets;
    }

    public void setQt_retweets(Long qt_retweets) {
        this.qt_retweets = qt_retweets;
    }

    public int getSn_retweet() {
        return sn_retweet;
    }

    public void setSn_retweet(int sn_retweet) {
        this.sn_retweet = sn_retweet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
