package edu.pingpong.cotxox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.cotxox.domain.Conductor;

public class ConductorTest {

    Conductor conductor;

    @Before
    public void setupConductor(){
        this.conductor = new Conductor("Sergio"); //Creamos el objeto this.conductor con el valor "Sergio"

    }


    @Test
    public void constructorTest(){
        assertNotNull(this.conductor);

    }

    @Test
    public void getModeloTest(){
        this.conductor.setModelo("Seat");
        assertEquals("Seat", this.conductor.getModelo());

    }


    @Test
    public void getValoracionMediaTest(){
        this.conductor.setValoracion((byte) 8);
        assertEquals((byte) 8, this.conductor.getValoracion(), 0);
    }

    @Test
    public void getMatriculaTest(){
        this.conductor.setMatricula("2532JVX");
        assertEquals("2532JVX", this.conductor.getMatricula());

    }




    
    
}
