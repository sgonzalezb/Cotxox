package edu.pingpong.cotxox.domain;

public class Tarifa {

    final static Double COSTEMILLA =  1.35;
    final static Double COSTEMINUTO =  0.35;
    final static Double COSTEMINIMO=  5.0;
    final static Byte PORCENTAJECOMISION = 20;
    static Carrera carrera;

    public static Double getCosteDistancia(double distancia) {
        return COSTEMILLA * distancia ;

    }

    public static double getCosteTiempo(double minutos){
        return COSTEMINUTO * minutos;

    }

    public static Double getCosteTotalEsperado(Carrera carrera){
        Double tiempo = (double)carrera.getTiempoCarrera() * COSTEMINUTO; 
        Double millas = carrera.getDistancia() * COSTEMILLA;
        Double precio = tiempo + millas;
        if (precio < 5.0) {
            return 5.0;
            
        } else {
            return precio;
        }
        
    }



}
