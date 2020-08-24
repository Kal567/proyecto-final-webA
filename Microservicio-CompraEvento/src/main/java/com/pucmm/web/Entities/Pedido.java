package com.pucmm.web.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue
    private int idPedido;

    private int idEventoPedido;
    private String plan;
    private double monto;
    private int idEmpleadoEncargado;
    private String nombreEmpleadoEncargado;
    private boolean isCompletado;

    public Pedido(){
        super();
    }

    public Pedido(int idPedido, int idEventoPedido, String plan, double monto,
                  int idEmpleadoEncargado, String nombreEmpleadoEncargado, boolean isCompletado){
        this.idPedido = idPedido;
        this.idEventoPedido =idEventoPedido;
        this.plan = plan;
        this.monto = monto;
        this.idEmpleadoEncargado = idEmpleadoEncargado;
        this.nombreEmpleadoEncargado = nombreEmpleadoEncargado;
        this.isCompletado = isCompletado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdEventoPedido() {
        return idEventoPedido;
    }

    public void setIdEventoPedido(int idEventoPedido) {
        this.idEventoPedido = idEventoPedido;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getIdEmpleadoEncargado() {
        return idEmpleadoEncargado;
    }

    public void setIdEmpleadoEncargado(int idEmpleadoEncargado) {
        this.idEmpleadoEncargado = idEmpleadoEncargado;
    }

    public String getNombreEmpleadoEncargado() {
        return nombreEmpleadoEncargado;
    }

    public void setNombreEmpleadoEncargado(String nombreEmpleadoEncargado) {
        this.nombreEmpleadoEncargado = nombreEmpleadoEncargado;
    }

    public boolean isCompletado() {
        return isCompletado;
    }

    public void setCompletado(boolean completado) {
        isCompletado = completado;
    }
}
