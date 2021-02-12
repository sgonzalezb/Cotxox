package edu.pingpong.cotxox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.cotxox.domain.Carrera;


public class CarreraTest{

    private Carrera tarjeta;
    
    @Before
    public void setupTarjeta(){
        this.tarjeta = new Carrera("123456789");
    }

    @Test
    public void constructorTest(){
        assertNotNull(this.tarjeta);

    }

    @Test
    public void getTarjetaTest(){
        assertEquals("123456789", this.tarjeta.getTarjetaCredito());
    }

    
    
}
