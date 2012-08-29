package br.faccamp.domain;

import javax.crypto.Mac;

import br.faccamp.view.CalculadoraGUI;

public class Operacoes {

	CalculadoraGUI gui;

	public Operacoes(CalculadoraGUI gui) {
		this.gui = gui;
	}

	// ************* operaçopescom dosi valores*************
	public String soma(double a, double b) {
		return String.valueOf(a + b);

	}

	public String subtracao(double a, double b) {
		return String.valueOf(a - b);
	}

	public String multipicacao(double a, double b) {
		return String.valueOf(a * b);
	}

	public String divisao(double a, double b) {
		if (b != 0) {
			return String.valueOf(a / b);
		} else {
			return String.valueOf(0);
		}
	}

	public String yElevadoX(double a, double b) {

		return String.valueOf(Math.pow(a,b));
	}

	// ************** operaçoescomum valor **************************

	public String fatorial(double a,double b) {
		if(a>=2){
			fatorial(a-1,(a*a-1));
		}
		return String.valueOf(b);
	}

	public String raiz(double a) {
		return String.valueOf(Math.sqrt(a));

	}

	public String log(double a) {

		return String.valueOf(Math.log10(a));
	}
	
	public String inverter(double a) {

		return String.valueOf(a*-1);
	}

	public String umSobreX(double a) {
		
		return String.valueOf(1/a);
	}
}
