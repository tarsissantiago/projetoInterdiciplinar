package br.faccamp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import br.faccamp.domain.Calculadora;
import javax.swing.SwingConstants;

public class CalculadoraGUI {
	;
	private JFrame frame;
	private JTextField display;
	private Calculadora calculadora;

	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Create the application.
	 */
	public CalculadoraGUI(Calculadora calculadora) {
		this.calculadora = calculadora;
		initialize();
		getFrame().setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		createMainFrame();
		createButtons();
	}

	private void createButtons() {
		JButton buttonMC = new JButton("MC");
		buttonMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaMC();
			}
		});
		buttonMC.setBounds(45, 79, 63, 39);
		frame.getContentPane().add(buttonMC);

		display = new JTextField("0");
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBounds(112, 11, 226, 56);
		frame.getContentPane().add(display);
		display.setColumns(10);
		display.setEditable(false);
		

		JButton buttonMR = new JButton("MR");
		buttonMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaMR();
			}
		});
		buttonMR.setBounds(115, 79, 63, 39);
		frame.getContentPane().add(buttonMR);

		JButton btnMS = new JButton("MS");
		btnMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculadora.processaMS();
			}
		});
		btnMS.setBounds(190, 79, 63, 39);
		frame.getContentPane().add(btnMS);

		JButton btnMMais = new JButton("M+");
		btnMMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaMMais();
			}
		});
		btnMMais.setBounds(265, 79, 63, 39);
		frame.getContentPane().add(btnMMais);

		JButton btnMMenos = new JButton("M-");
		btnMMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaMMenos();
			}
		});
		btnMMenos.setBounds(340, 79, 63, 39);
		frame.getContentPane().add(btnMMenos);

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaCE();
			}
		});
		btnCE.setBounds(45, 130, 63, 39);
		frame.getContentPane().add(btnCE);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaC();
			}
		});
		btnC.setBounds(115, 130, 63, 39);
		frame.getContentPane().add(btnC);

		JButton btnRaiz = new JButton("Raiz");
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaRaiz();
			}
		});
		btnRaiz.setBounds(265, 130, 63, 39);
		frame.getContentPane().add(btnRaiz);

		JButton buttonMaisOuMenos = new JButton("+/-");
		buttonMaisOuMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaMaisOuMenos();
			}
		});
		buttonMaisOuMenos.setBounds(190, 130, 63, 39);
		frame.getContentPane().add(buttonMaisOuMenos);

		JButton btnFatorial = new JButton("n!");
		btnFatorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaFatorial();
			}
		});
		btnFatorial.setBounds(340, 130, 63, 39);
		frame.getContentPane().add(btnFatorial);

		JButton buttonSete = new JButton("7");
		buttonSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaSete();
			}
		});
		buttonSete.setBounds(45, 181, 63, 39);
		frame.getContentPane().add(buttonSete);

		JButton buttonOito = new JButton("8");
		buttonOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaOito();
			}
		});
		buttonOito.setBounds(115, 181, 63, 39);
		frame.getContentPane().add(buttonOito);

		JButton buttonNove = new JButton("9");
		buttonNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaNove();
			}
		});
		buttonNove.setBounds(190, 181, 63, 39);
		frame.getContentPane().add(buttonNove);

		JButton buttonDivisao = new JButton("/");
		buttonDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaDivisao();
			}
		});
		buttonDivisao.setBounds(265, 181, 63, 39);
		frame.getContentPane().add(buttonDivisao);

		JButton buttonPercentual = new JButton("%");
		buttonPercentual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaPorcentual();
			}
		});
		buttonPercentual.setBounds(340, 181, 63, 39);
		frame.getContentPane().add(buttonPercentual);

		JButton buttonQuatro = new JButton("4");
		buttonQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaQuatro();
			}
		});
		buttonQuatro.setBounds(45, 232, 63, 39);
		frame.getContentPane().add(buttonQuatro);

		JButton buttonCinco = new JButton("5");
		buttonCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaCinco();
			}
		});
		buttonCinco.setBounds(115, 232, 63, 39);
		frame.getContentPane().add(buttonCinco);

		JButton buttonSeis = new JButton("6");
		buttonSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaSeis();
			}
		});
		buttonSeis.setBounds(190, 232, 63, 39);
		frame.getContentPane().add(buttonSeis);

		JButton buttonVezes = new JButton("*");
		buttonVezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaVezes();
			}
		});
		buttonVezes.setBounds(265, 232, 63, 39);
		frame.getContentPane().add(buttonVezes);

		JButton btnUmSobreX = new JButton("1/x");
		btnUmSobreX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaUmSobreX();
			}
		});
		btnUmSobreX.setBounds(340, 232, 63, 39);
		frame.getContentPane().add(btnUmSobreX);

		JButton buttonUm = new JButton("1");
		buttonUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaUm();
			}
		});
		buttonUm.setBounds(45, 280, 63, 39);
		frame.getContentPane().add(buttonUm);

		JButton buttonDois = new JButton("2");
		buttonDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaDois();
			}
		});
		buttonDois.setBounds(115, 280, 63, 39);
		frame.getContentPane().add(buttonDois);

		JButton buttonTres = new JButton("3");
		buttonTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaTres();
			}
		});
		buttonTres.setBounds(190, 280, 63, 39);
		frame.getContentPane().add(buttonTres);

		JButton buttonMenos = new JButton("-");
		buttonMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaMenos();
			}
		});
		buttonMenos.setBounds(265, 280, 63, 39);
		frame.getContentPane().add(buttonMenos);

		JButton btnXElevadoY = new JButton("x^y");
		btnXElevadoY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaXElevadoY();
			}
		});
		btnXElevadoY.setBounds(340, 280, 63, 39);
		frame.getContentPane().add(btnXElevadoY);

		JButton buttonZero = new JButton("0");
		buttonZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaZero();
			}
		});
		buttonZero.setBounds(45, 322, 63, 39);
		frame.getContentPane().add(buttonZero);

		JButton buttonVirgula = new JButton(",");
		buttonVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaVirgula();
			}
		});
		buttonVirgula.setBounds(115, 322, 63, 39);
		frame.getContentPane().add(buttonVirgula);

		JButton buttonIgual = new JButton("=");
		buttonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaIgual();
			}
		});
		buttonIgual.setBounds(190, 322, 63, 39);
		frame.getContentPane().add(buttonIgual);

		JButton buttonMais = new JButton("+");
		buttonMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaMais();
			}
		});
		buttonMais.setBounds(265, 322, 63, 39);
		frame.getContentPane().add(buttonMais);

		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.processaLog();
			}
		});
		btnLog.setBounds(340, 322, 63, 39);
		frame.getContentPane().add(btnLog);
	}

	private void createMainFrame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}

	public void atualizaDisplay(String texto) {
		display.setText(texto);
	}

	public String getDisplay() {
		return display.getText();
	}
}
