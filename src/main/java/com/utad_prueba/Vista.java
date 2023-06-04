package com.utad_prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private Modelo miModelo;
	private Controlador miControlador;
	private JTextField txtPantalla;
	private JButton btnAC;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnMulti;
	private JButton btnDivision;
	private JButton btnIgual;
	
	public Vista() {		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtPantalla = new JTextField();
		txtPantalla.setBounds(37, 11, 188, 57);
		getContentPane().add(txtPantalla);
		txtPantalla.setColumns(10);
		txtPantalla.setText("0");
		
		btnAC = new JButton("AC");
		btnAC.setBounds(291, 11, 89, 56);
		getContentPane().add(btnAC);
		
		btn1 = new JButton("1");
		btn1.setBounds(37, 79, 47, 38);
		getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(108, 79, 47, 38);
		getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(178, 79, 47, 38);
		getContentPane().add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBounds(37, 128, 47, 38);
		getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(108, 128, 47, 38);
		getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(178, 128, 47, 38);
		getContentPane().add(btn6);
		
		btn7 = new JButton("7");
		btn7.setBounds(37, 177, 47, 38);
		getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(108, 177, 47, 38);
		getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(178, 177, 47, 38);
		getContentPane().add(btn9);
		
		btnSuma = new JButton("+");
		btnSuma.setBounds(291, 78, 47, 38);
		getContentPane().add(btnSuma);
		btnSuma.setEnabled(false);
		
		btnResta = new JButton("-");
		btnResta.setBounds(357, 78, 47, 38);
		getContentPane().add(btnResta);
		btnResta.setEnabled(false);
		
		btnMulti = new JButton("*");
		btnMulti.setBounds(291, 137, 47, 38);
		getContentPane().add(btnMulti);
		btnMulti.setEnabled(false);
		
		btnDivision = new JButton("/");
		btnDivision.setBounds(357, 137, 47, 38);
		getContentPane().add(btnDivision);
		btnDivision.setEnabled(false);
		
		btnIgual = new JButton("=");
		btnIgual.setBounds(291, 188, 113, 38);
		getContentPane().add(btnIgual);
		btnIgual.setEnabled(false);
		
		btn0 = new JButton("0");
		btn0.setBounds(108, 218, 47, 38);
		getContentPane().add(btn0);
		
		
		///LISTENERS
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.limpiaPantalla();
			}
		});
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Sres = miControlador.igual();
				txtPantalla.setText(Sres);
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = miControlador.pulsaNumero(1);
				txtPantalla.setText(cadena);
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = miControlador.pulsaNumero(2);
				txtPantalla.setText(cadena);
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = miControlador.pulsaNumero(3);
				txtPantalla.setText(cadena);
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = miControlador.pulsaNumero(4);
				txtPantalla.setText(cadena);
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = miControlador.pulsaNumero(5);
				txtPantalla.setText(cadena);
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = miControlador.pulsaNumero(6);
				txtPantalla.setText(cadena);
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = miControlador.pulsaNumero(7);
				txtPantalla.setText(cadena);
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = miControlador.pulsaNumero(8);
				txtPantalla.setText(cadena);
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = miControlador.pulsaNumero(9);
				txtPantalla.setText(cadena);
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = miControlador.pulsaNumero(0);
				txtPantalla.setText(cadena);
			}
		});
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.sumar();
			}
		});
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.restar();
			}
		});
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.multiplicar();
			}
		});
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.dividir();
			}
		});
	}
	
	public void limpiaPantalla() {
		txtPantalla.setText("0");
	}
	
	public void deshabilitaOp() {
		btnSuma.setEnabled(false);
		btnResta.setEnabled(false);
		btnMulti.setEnabled(false);
		btnDivision.setEnabled(false);
	}
	public void habilitaOp() {
		btnSuma.setEnabled(true);
		btnResta.setEnabled(true);
		btnMulti.setEnabled(true);
		btnDivision.setEnabled(true);
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void habilitaIgual() {
		btnIgual.setEnabled(true);
	}

	


	
}
