package br.ufpb.dcx.ayla.atletas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtletaTest {

    @Test
    public void testaConstrutor(){
        Atleta a1 = new Atleta("XX",18, new ArrayList<>());
        assertEquals("XX", a1.getCodigo());
        assertEquals(18, a1.getIdade());
    }
}
