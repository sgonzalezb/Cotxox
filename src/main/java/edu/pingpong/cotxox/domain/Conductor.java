package edu.pingpong.cotxox.domain;

import java.util.ArrayList;

public class Conductor {

    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 2.;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<>();


    public Conductor(){}

    
    public Conductor(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
            return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return valoracionMedia;
    }

    public int getNumeroValoraciones(){
        return this.valoraciones.size();
    }

  
    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }


    public double calcularValoracionMedia(){
        double sumaValoraciones = 0.;
        for (byte valoracion : this.valoraciones){      //Intentar refactorizar con STREAM
            sumaValoraciones += valoracion;
        }
        this.valoracionMedia = sumaValoraciones / valoraciones.size(); //Intentado con un acumulador de valoraciones pero no es posible
        return this.valoracionMedia;                                    //que el denominador sea igual a 0 y no compila.
    }


    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }


    
    


    
}
