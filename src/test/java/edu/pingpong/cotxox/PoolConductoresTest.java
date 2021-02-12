package edu.pingpong.cotxox;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.cotxox.domain.Conductor;

public class PoolConductoresTest {

    List<Conductor> poolConductores = new ArrayList<Conductor>();
    Conductor conductor = null;
    private String[] nombres = {"Sergio","Ana","Carla","Juana"};

    @Test 
    public void constructorTest() {
        for(String nombre:nombres){
            Conductor conductor = new Conductor(nombre);
            poolConductores.add(conductor);
        }
        assertNotNull(poolConductores);
    }
    
}
