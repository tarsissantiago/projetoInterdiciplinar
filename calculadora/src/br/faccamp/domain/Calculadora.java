package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Calculadora {

	Operacoes op;
	private CalculadoraGUI gui;
	private Display display;
	private double Memoria;

	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);
		op = new Operacoes(gui);
	}

	// ***************************Memoria**************************

	public double getMemoria() {
		return Memoria;
	}

	public void setMemoria(double memoria) {
		Memoria = memoria;
	}

	public void processaMC() {
		setMemoria(0);

	}

	public void processaMR() {
		gui.atualizaDisplay(String.valueOf(getMemoria()));
		display.finalDoNumero = (true);
	}

	public void processaMS() {
		setMemoria(Double.parseDouble(gui.getDisplay()));
		display.finalDoNumero = (true);
	}

	public void processaMMais() {
		setMemoria(getMemoria() + Double.parseDouble(gui.getDisplay()));
		display.finalDoNumero = (true);
	}

	public void processaMMenos() {
		setMemoria(getMemoria() - Double.parseDouble(gui.getDisplay()));
		display.finalDoNumero = (true);

	}

	// *************teclado Numerico*********************

	public void processaZero() {
		display.atualiza("0");
	}

	public void processaUm() {
		display.atualiza("1");
	}

	public void processaDois() {
		display.atualiza("2");
	}

	public void processaTres() {
		display.atualiza("3");
	}

	public void processaQuatro() {
		display.atualiza("4");
	}

	public void processaCinco() {
		display.atualiza("5");
	}

	public void processaSeis() {
		display.atualiza("6");
	}

	public void processaSete() {
		display.atualiza("7");
	}

	public void processaOito() {
		display.atualiza("8");
	}

	public void processaNove() {
		display.atualiza("9");
	}

	public void processaVirgula() {
		display.podeDigitar(".");
	}

	// Operaçoes

	public void processaIgual() {
		if (display.operador != '=') {
			display.salvaB();
			gui.atualizaDisplay(display.calcula());
			display.finalDoNumero = (true);
			display.expresao = (false);
			display.operador = '=';
		}
	}

	// ****************Operações com dois valores************************

	public void processaVezes() {
		botaoOperacaoComDoisValoresPresionado('*');
	}

	public void processaDivisao() {
		botaoOperacaoComDoisValoresPresionado('/');
	}

	public void processaMenos() {
		botaoOperacaoComDoisValoresPresionado('-');
	}

	public void processaMais() {
		botaoOperacaoComDoisValoresPresionado('+');
	}

	public void processaXElevadoY() {
		botaoOperacaoComDoisValoresPresionado('e');
	}

	public void botaoOperacaoComDoisValoresPresionado(char op) {

		if (display.digitou) {
			if (!display.expresao) {
				display.salvaA();
				display.finalDoNumero = (true);
				display.operador = op;
				display.expresao = (true);
			} else {
				display.salvaB();
				gui.atualizaDisplay(display.calcula());
				display.salvaA();
				display.finalDoNumero = (true);
				display.operador = op;
			}
			display.digitou = (false);
		}
	}

	// ****************Operaçoes comumvalor************************************

	public void processaRaiz() {
		botaoOperacaoComUmValorPresionado('r');
	}

	public void processaMaisOuMenos() {
		botaoOperacaoComUmValorPresionado('i');

	}

	public void processaFatorial() {
		botaoOperacaoComUmValorPresionado('f');

	}

	public void processaPorcentual() {
		botaoOperacaoComDoisValoresPresionado('%');
	}

	public void processaUmSobreX() {
		botaoOperacaoComUmValorPresionado('x');
	}

	public void processaLog() {
		botaoOperacaoComUmValorPresionado('l');
	}

	public void botaoOperacaoComUmValorPresionado(char op) {
		display.salvaA();
		display.finalDoNumero = (true);
		display.operador = op;
		gui.atualizaDisplay(display.calcula());
	}

	// memoria & funçoes calculadora

	public void processaCE() {
		gui.atualizaDisplay("0");
		display.salvaA();
		display.expresao = (false);
	}

	public void processaC() {
		gui.atualizaDisplay("0");
		display.salvaA();
		display.expresao = (false);
	}

}
