package com.example.demo;

public class Calculadora {
	
	CalculadoraGoogle calculadoraGoogle;
			
	public Calculadora(CalculadoraGoogle calculadoraGoogle) {
		this.calculadoraGoogle = calculadoraGoogle;
	}

	public int sumaNuestra(int a, int b) {
		return calculadoraGoogle.sumar(a,b);
	}

}
