package com.pucmm.web.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {


    @Id
    @GeneratedValue
    private int idUsuario;

    private String username;
    private String email;
    private String password;
    private boolean isAdmin;
    private String rol; //If cliente: Cliente. || If empleado: fotógrafo, camarógrafo o personal de apoyo

    public Usuario(){
        super();
    }

    public Usuario(int idUsuario, String username, String email, String password, boolean isAdmin, String rol){
        this.idUsuario = idUsuario;
        this.username = username;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
