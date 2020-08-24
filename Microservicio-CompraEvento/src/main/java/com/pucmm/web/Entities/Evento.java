package com.pucmm.web.Entities;

import javax.persistence.Entity;

@Entity
public class Evento {

    private int idEvento;
    private String titulo;
    private double monto;

    private Evento(){
        super();
    }

    public Evento(int idEvento, String titulo, double monto){
        this.idEvento = idEvento;
        this.titulo = titulo;
        this.monto = monto;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
