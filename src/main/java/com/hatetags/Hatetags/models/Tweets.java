package com.hatetags.Hatetags.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Tweets {

    @Id
    private long id_tweet;

    private long id_usuario;

    private String ds_tweet;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dh_tweet;

    private long qt_favoritos;

    private long qt_retweets;

    private int sn_retweet;

    public long getId_tweet() {
        return id_tweet;
    }

    public void setId_tweet(long id_tweet) {
        this.id_tweet = id_tweet;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
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

    public long getQt_favoritos() {
        return qt_favoritos;
    }

    public void setQt_favoritos(long qt_favoritos) {
        this.qt_favoritos = qt_favoritos;
    }

    public long getQt_retweets() {
        return qt_retweets;
    }

    public void setQt_retweets(long qt_retweets) {
        this.qt_retweets = qt_retweets;
    }

    public int getSn_retweet() {
        return sn_retweet;
    }

    public void setSn_retweet(int sn_retweet) {
        this.sn_retweet = sn_retweet;
    }
}
