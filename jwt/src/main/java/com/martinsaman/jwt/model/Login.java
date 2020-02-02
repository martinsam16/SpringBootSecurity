package com.martinsaman.jwt.model;

public class Login {

    private String nomuser;
    private String pssw;
    private String token;
    private Boolean isAuth;

    public String getNomuser() {
        return nomuser;
    }

    public void setNomuser(String nomuser) {
        this.nomuser = nomuser;
    }

    public String getPssw() {
        return pssw;
    }

    public void setPssw(String pssw) {
        this.pssw = pssw;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getAuth() {
        return isAuth;
    }

    public void setAuth(Boolean auth) {
        isAuth = auth;
    }
}
