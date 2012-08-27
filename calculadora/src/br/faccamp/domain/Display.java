package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Display {

	private CalculadoraGUI gui;
	public double a, b;
	public char operador='=';
	public boolean expresao, finalDoNumero, digitou = false;
	private Operacoes op = new Operacoes(gui);

	public Display(CalculadoraGUI gui) {
		this.gui = gui;

	}

	public void atualiza(String texto) {
				if ((getConteudo().equalsIgnoreCase("0")&&!(texto.equalsIgnoreCase("."))) || finalDoNumero) {

				zeraDisplay();
				gui.atualizaDisplay(texto);
				finalDoNumero = (false);
			} else {
				gui.atualizaDisplay((getConteudo() + texto));
			}
			digitou = (true);
	}

	public void podeDigitar(String texto) {
			if(getConteudo().indexOf(texto)==-1){
				atualiza(texto);
			}
					

	}

	private String getConteudo() {
		return gui.getDisplay();
	}

	public void zeraDisplay() {
		gui.atualizaDisplay("0");
	}

	public void salvaA() {
		a = (Double.parseDouble(getConteudo()));
	}

	public void salvaB() {
		b = (Double.parseDouble(getConteudo()));

	}

	public String calcula() {
		switch (operador) {

		// operaçoescomcoid valores
		case ('+'):
			return op.soma(a, b);
		case ('-'):
			return op.subtracao(a, b);
		case ('*'):
			return op.multipicacao(a, b);
		case ('/'):
			return op.divisao(a, b);
		case ('e'):
			return op.yElevadoX(a, b);

			// Operaçoes com um valor
		case ('r'):
			return op.raiz(a);
		case ('l'):
			return op.log(a);
		case ('f'):
			return op.fatorial(a,0);

		}
		return null;

	}
}
