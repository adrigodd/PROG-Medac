package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private static final Assertions Assert = null;

	@Test

    public void testSumar() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.sumar(2, 3);

        Assertions.assertEquals(5, resultado);

    }

    @Test

    public void testRestar() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.restar(3, 2);

        Assertions.assertEquals(1, resultado);

    }

    @Test

    public void testMultiplicar() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplicar(2, 3);

        Assertions.assertEquals(6, resultado);

    }

    @Test

    public void testDividir() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.dividir(6, 3);

        Assertions.assertEquals(2, resultado);

    }

   
    

    

}


