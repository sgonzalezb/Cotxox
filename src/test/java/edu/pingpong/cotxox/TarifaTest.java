package edu.pingpong.cotxox;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.pingpong.cotxox.domain.Tarifa;

public class TarifaTest {

    
    @Test
    public void getCosteDistanciaTest(){
        Double distancia = 5.0;
        assertEquals(6.75, Tarifa.getCosteDistancia(distancia),0);

    }
    
}
