package com.utad_prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Vista extends JFrame {

	private Modelo miModelo;
	private Controlador miControlador;
	
	public Vista() {		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

}
