package com.figueiredo;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.figueiredo.capitulo_10.Fatura;

/**
 * Unit test for simple App.
 */
public class FaturaTest {

    @Test
    public void testeQuantidadeZero() {

        Fatura fatura = new Fatura(null, null, 0, 0);
        assertEquals(fatura.getquantidade(), 0);
    }

    @Test
    public void testeQuantidadeDeveSerMaiorQueZero() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    Fatura fatura = new Fatura(null, null, -1, 0);
                    fatura.setquantidade(0);
                });

        assertEquals(exception.getMessage(), "Quantidade deve ser >= 0");
    }
    
    @Test
    public void testePrecoPorItemZero() {
    	Fatura fatura = new Fatura(null, null, 0, 0.00);
    	assertEquals(fatura.getprecoPorItem(), 0.00, 0.01);
    	
    }
    
    @Test
    public void testePrecoPorItemDeveSerMaiorQueZero() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    Fatura fatura = new Fatura(null, null, 0, -1);
                    fatura.setprecoPorItem(0);
                });

        assertEquals(exception.getMessage(), "Preço por item deve ser >= 0");
    }

    @Test
    public void teste() {
    	Fatura fatura = new Fatura(null, null, 3, 10.53);
    	
       double x = fatura.getValorDopagamento();
       assertEquals(x, 31.58, 0.01);
    	
    }

    




}
