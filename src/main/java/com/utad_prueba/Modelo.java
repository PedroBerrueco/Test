package com.utad_prueba;
import java.sql.*;

public class Modelo {

	private Vista miVista;
	
	private String bd ="calculadora";
	private String login ="root";
	private String pwd ="";
	private String url = "jdbc:mysql://localhost/" + bd;
	private Connection conexion;

	public void setVista(Vista miVista) {
		this.miVista = miVista;
	}
	
	
	
	public void abrirConexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, login, pwd);
			System.out.println("Conexión establecida");
		} catch (Exception e) {
			System.out.println(" – Error de Conexión con MySQL -");
			e.printStackTrace();
		}
	}
	public void cerrarConexion() {
		try {
			conexion.close();
			System.out.println("Conexión cerrada");
		} catch (Exception e) {
			System.out.println(" – Error de Conexión con MySQL -");
			e.printStackTrace();
		}
	}

	public void borraCache() {
		try {
			PreparedStatement stmt = conexion.prepareStatement("DELETE FROM operandos");
			stmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(" – Error en el borrado en BD -");
			e.printStackTrace();
		}
	}



	public void insertOperando1(int operando) {
		try {
			PreparedStatement stmt = conexion.prepareStatement("INSERT INTO operandos values (?,0)");
			stmt.setInt(1,operando );
			stmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(" – Error al insertar en BD -");
			e.printStackTrace();
		}
		
	}
	
	public void insertOperando2(int operando) {
		try {
			PreparedStatement stmt = conexion.prepareStatement("UPDATE operandos SET operando2 = ?");
			stmt.setInt(1,operando );
			stmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(" – Error al insertar en BD -");
			e.printStackTrace();
		}
		
	}


	public int getOp1() {
	    try {
	        Statement stmt = conexion.createStatement();
	        ResultSet rset = stmt.executeQuery("SELECT operando1 from operandos");

	        if (rset.next()) {
	            int respuesta = rset.getInt(1);
	            return respuesta;
	        } else {
	            throw new RuntimeException("No se encontró ningún valor en la consulta");
	        }
	    } catch (Exception e) {
	        System.out.println(" – Error de lectura en BD -");
	        e.printStackTrace();
	        throw new RuntimeException("Error al ejecutar la consulta en la base de datos", e);
	    }
	}
	public int getOp2() {
	    try {
	        Statement stmt = conexion.createStatement();
	        ResultSet rset = stmt.executeQuery("SELECT operando2 from operandos");

	        if (rset.next()) {
	            int respuesta = rset.getInt(1);
	            return respuesta;
	        } else {
	            throw new RuntimeException("No se encontró ningún valor en la consulta");
	        }
	    } catch (Exception e) {
	        System.out.println(" – Error de lectura en BD -");
	        e.printStackTrace();
	        throw new RuntimeException("Error al ejecutar la consulta en la base de datos", e);
	    }
	}


}
