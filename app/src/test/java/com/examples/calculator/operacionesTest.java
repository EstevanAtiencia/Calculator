package com.examples.calculator;



import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class operacionesTest  {
    private operaciones mOperacion;

    @Before
    public void setUp(){
        mOperacion = new operaciones();
    }

    @Test
    public void operacionNotNull(){
        assertNotNull(mOperacion);
    }

    @Test
    public void suma1() throws Exception {
        assertEquals("7",mOperacion.suma(3,4));
    }

    @Test
    public void suma3() throws Exception {
        assertEquals("11",mOperacion.suma(7,4));
    }


}




