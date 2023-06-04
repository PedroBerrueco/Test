package com.utad_prueba;

import java.util.ArrayList;

public class Controlador {

	private Vista miVista;
	private Modelo miModelo;
	private boolean operacion = false;
	private int tipoOperacion = 0;

	ArrayList<Integer> operador1 = new ArrayList();
	ArrayList<Integer> operador2 = new ArrayList();

	public void setVista(Vista miVista) {
		this.miVista = miVista;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void limpiaPantalla() {
		miModelo.abrirConexion();
		miModelo.borraCache();
		miModelo.cerrarConexion();
		operador1.clear();
		operador2.clear();
		miVista.limpiaPantalla();
		operacion = false;
	}

	public String pulsaNumero(int i) {
		String cadenaMostrar = "";
		if (operacion) {
			operador2.add(i);
			for (int reg : operador2) {
				String stringreg = Integer.toString(reg);
				cadenaMostrar += stringreg;
			}
			miVista.habilitaIgual();
		} else {
			operador1.add(i);
			for (int reg : operador1) {
				String stringreg = Integer.toString(reg);
				cadenaMostrar += stringreg;
			}
			miVista.habilitaOp();
		}
		
		return cadenaMostrar;
	}

	public void setOperacion(boolean operacion) {
		this.operacion = operacion;
	}

	public void sumar() {
		operacion = true;
		
		StringBuilder sb = new StringBuilder();
		for (int numero : operador1) {
		    sb.append(numero);
		}
		String cadenaNumeros = sb.toString();
		int resultado = Integer.parseInt(cadenaNumeros);
		
		miModelo.abrirConexion();
		miModelo.insertOperando1(resultado);
		miModelo.cerrarConexion();
		miVista.deshabilitaOp();
		tipoOperacion = 1;
		
	}
	public void restar() {
		operacion = true;
		
		StringBuilder sb = new StringBuilder();
		for (int numero : operador1) {
		    sb.append(numero);
		}
		String cadenaNumeros = sb.toString();
		int resultado = Integer.parseInt(cadenaNumeros);
		
		miModelo.abrirConexion();
		miModelo.insertOperando1(resultado);
		miModelo.cerrarConexion();
		
		miVista.deshabilitaOp();
		tipoOperacion = 2;
		
	}
	public void multiplicar() {
		operacion = true;
		
		StringBuilder sb = new StringBuilder();
		for (int numero : operador1) {
		    sb.append(numero);
		}
		String cadenaNumeros = sb.toString();
		int resultado = Integer.parseInt(cadenaNumeros);
		
		miModelo.abrirConexion();
		miModelo.insertOperando1(resultado);
		miModelo.cerrarConexion();
		
		miVista.deshabilitaOp();
		tipoOperacion = 3;
		
	}
	public void dividir() {
		operacion = true;
		
		StringBuilder sb = new StringBuilder();
		for (int numero : operador1) {
		    sb.append(numero);
		}
		String cadenaNumeros = sb.toString();
		int resultado = Integer.parseInt(cadenaNumeros);
		
		miModelo.abrirConexion();
		miModelo.insertOperando1(resultado);
		miModelo.cerrarConexion();
		
		miVista.deshabilitaOp();
		tipoOperacion = 4;
		
	}
	
	public String igual () {
		operacion = false;
		
		StringBuilder sb = new StringBuilder();
		for (int numero : operador2) {
		    sb.append(numero);
		}
		String cadenaNumeros = sb.toString();
		int resultado = Integer.parseInt(cadenaNumeros);
		
		miModelo.abrirConexion();
		miModelo.insertOperando2(resultado);
		
		int op1 = miModelo.getOp1();
		int op2 = miModelo.getOp2();
		
		miModelo.cerrarConexion();
		
		int res = 0;
		switch (tipoOperacion) {
		case 1: 
			 res = op1 + op2;
			break;
		case 2:
			res = op1 - op2;
			break;
		case 3:
			res = op1 * op2;
			break;
		case 4:
			res = op1 / op2;
			break;
		default:
			System.out.println("Operación incorrecta");
			break;
		}
		
		
		String Sres = Integer.toString(res);
		
		return (Sres);
		
		
	}

}
