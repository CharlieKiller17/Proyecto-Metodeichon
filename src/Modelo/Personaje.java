/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
class Personaje {
    //Atributos
    private String nombrePersonaje;
    private int nivelPersonaje;
    private int puntosExperiencia;
    private int puntosVidaTotal;
    private int puntosVidaActual;
    private int puntosAtaqueCorto;
    private int puntosAtaqueLargo;
    private int puntosAtaqueMagia;
    private int puntosMagia;
    private int puntosDefensa;
    private int puntosTraicion;
    private int costePersonaje;
    private int puntosMovimiento;
    private int puntosVelocidad;
    private int contrato;
    private int tipoPersonaje;
    private int rolPersonaje;
    private ArrayList<String> inventario;
    private ArrayList<String> equipamiento;

    public Personaje(String nombrePersonaje, int nivelPersonaje, int puntosExperiencia, int puntosVidaTotla, int puntosVidaActual, int putosAtaqueCorto, int putosAtaqueLargo, int putosAtaqueMagia, int putosMagia, int putosDefensa, int putosTraicion, int costePersonaje, int puntosMovimiento, int puntosVelocidad, int contrato, int tipoPersonaje, int rolPersonaje, ArrayList<String> inventario, ArrayList<String> equipamiento) {
        this.nombrePersonaje = nombrePersonaje;
        this.nivelPersonaje = nivelPersonaje;
        this.puntosExperiencia = puntosExperiencia;
        this.puntosVidaTotal = puntosVidaTotla;
        this.puntosVidaActual = puntosVidaActual;
        this.puntosAtaqueCorto = putosAtaqueCorto;
        this.puntosAtaqueLargo = putosAtaqueLargo;
        this.puntosAtaqueMagia = putosAtaqueMagia;
        this.puntosMagia = putosMagia;
        this.puntosDefensa = putosDefensa;
        this.puntosTraicion = putosTraicion;
        this.costePersonaje = costePersonaje;
        this.puntosMovimiento = puntosMovimiento;
        this.puntosVelocidad = puntosVelocidad;
        this.contrato = contrato;
        this.tipoPersonaje = tipoPersonaje;
        this.rolPersonaje = rolPersonaje;
        this.inventario = inventario;
        this.equipamiento = equipamiento;
    }
        public Personaje() {
        this.nombrePersonaje = "";
        this.nivelPersonaje = 0;
        this.puntosExperiencia = 0;
        this.puntosVidaTotal = 0;
        this.puntosVidaActual = 0;
        this.puntosAtaqueCorto = 0;
        this.puntosAtaqueLargo = 0;
        this.puntosAtaqueMagia = 0;
        this.puntosMagia = 0;
        this.puntosDefensa = 0;
        this.puntosTraicion = 0;
        this.costePersonaje = 0;
        this.puntosMovimiento = 0;
        this.puntosVelocidad = 0;
        this.contrato = 0;
        this.tipoPersonaje = 0;
        this.rolPersonaje = 0;
        this.inventario = null;
        this.equipamiento = null;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public int getNivelPersonaje() {
        return nivelPersonaje;
    }

    public void setNivelPersonaje(int nivelPersonaje) {
        this.nivelPersonaje = nivelPersonaje;
    }

    public int getPuntosExperiencia() {
        return puntosExperiencia;
    }

    public void setPuntosExperiencia(int puntosExperiencia) {
        this.puntosExperiencia = puntosExperiencia;
    }

    public int getPuntosVidaTotla() {
        return puntosVidaTotal;
    }

    public void setPuntosVidaTotla(int puntosVidaTotla) {
        this.puntosVidaTotal = puntosVidaTotla;
    }

    public int getPuntosVidaActual() {
        return puntosVidaActual;
    }

    public void setPuntosVidaActual(int puntosVidaActual) {
        this.puntosVidaActual = puntosVidaActual;
    }

    public int getPuntosAtaqueCorto() {
        return puntosAtaqueCorto;
    }

    public void setPuntosAtaqueCorto(int putosAtaqueCorto) {
        this.puntosAtaqueCorto = putosAtaqueCorto;
    }

    public int getPuntosAtaqueLargo() {
        return puntosAtaqueLargo;
    }

    public void setPuntosAtaqueLargo(int putosAtaqueLargo) {
        this.puntosAtaqueLargo = putosAtaqueLargo;
    }

    public int getPuntosAtaqueMagia() {
        return puntosAtaqueMagia;
    }

    public void setPuntosAtaqueMagia(int putosAtaqueMagia) {
        this.puntosAtaqueMagia = putosAtaqueMagia;
    }

    public int getPuntosMagia() {
        return puntosMagia;
    }

    public void setPuntosMagia(int putosMagia) {
        this.puntosMagia = putosMagia;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int putosDefensa) {
        this.puntosDefensa = putosDefensa;
    }

    public int getPuntosTraicion() {
        return puntosTraicion;
    }

    public void setPuntosTraicion(int putosTraicion) {
        this.puntosTraicion = putosTraicion;
    }

    public int getCostePersonaje() {
        return costePersonaje;
    }

    public void setCostePersonaje(int costePersonaje) {
        this.costePersonaje = costePersonaje;
    }

    public int getPuntosMovimiento() {
        return puntosMovimiento;
    }

    public void setPuntosMovimiento(int puntosMovimiento) {
        this.puntosMovimiento = puntosMovimiento;
    }

    public int getPuntosVelocidad() {
        return puntosVelocidad;
    }

    public void setPuntosVelocidad(int puntosVelocidad) {
        this.puntosVelocidad = puntosVelocidad;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getTipoPersonaje() {
        return tipoPersonaje;
    }

    public void setTipoPersonaje(int tipoPersonaje) {
        this.tipoPersonaje = tipoPersonaje;
    }

    public int getRolPersonaje() {
        return rolPersonaje;
    }

    public void setRolPersonaje(int rolPersonaje) {
        this.rolPersonaje = rolPersonaje;
    }

    public ArrayList<String> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<String> inventario) {
        this.inventario = inventario;
    }

    public ArrayList<String> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(ArrayList<String> equipamiento) {
        this.equipamiento = equipamiento;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombrePersonaje=" + nombrePersonaje + ", nivelPersonaje=" + nivelPersonaje + ", puntosExperiencia=" + puntosExperiencia + ", puntosVidaTotal=" + puntosVidaTotal + ", puntosVidaActual=" + puntosVidaActual + ", putosAtaqueCorto=" + puntosAtaqueCorto + ", putosAtaqueLargo=" + puntosAtaqueLargo + ", putosAtaqueMagia=" + puntosAtaqueMagia + ", putosMagia=" + puntosMagia + ", putosDefensa=" + puntosDefensa + ", putosTraicion=" + puntosTraicion + ", costePersonaje=" + costePersonaje + ", puntosMovimiento=" + puntosMovimiento + ", puntosVelocidad=" + puntosVelocidad + ", contrato=" + contrato + ", tipoPersonaje=" + tipoPersonaje + ", rolPersonaje=" + rolPersonaje + ", inventario=" + inventario + ", equipamiento=" + equipamiento + '}';
    }
    
    
    
    
    //Metodos
    public int atacar(){return 0;}
    public int mover(){return 0;}
    
           
            
    
    
   
    
}
