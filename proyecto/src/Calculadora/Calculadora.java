package Calculadora;

import java.time.LocalDate;

public class Calculadora {
	public int sumar(int a, int b) {
	return a+b;
	}

	public int restar(int a, int b) {
		return a - b;
	}

	public int multiplicar(int a, int b) {
		return a * b;
	}

	public int dividir(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("El divisor no puede ser cero");
		}
		return a / b;
	}
	public void Vacio() {
		
	}
	public void Infinito(int a) {
		while(a==a) {
			System.out.println("Esto es un infinito");
		}			
		
	}
	public void AñadirFechaActual(int dias) {
		LocalDate fechaActual= LocalDate.now();
		fechaActual=fechaActual.plusDays(dias);
		
	}
	
}

