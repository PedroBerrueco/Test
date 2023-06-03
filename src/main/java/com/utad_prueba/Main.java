package com.utad_prueba;

public class Main {

	public static void main(String[] args) {
		
		Vista miVista = new Vista();
		Controlador miControlador = new Controlador();
		Modelo miModelo = new Modelo();
		
		
		miVista.setControlador(miControlador);
		miVista.setModelo(miModelo);
		
		miModelo.setVista(miVista);
		
		miControlador.setVista(miVista);
		miControlador.setModelo(miModelo);
		
		
		miVista.setVisible(true);
	}

}
