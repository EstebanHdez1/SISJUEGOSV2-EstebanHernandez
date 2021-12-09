package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class JugadorDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;	
	private int documento;
	private String Nombre;
	private int Edad;
	private String Genero;
	private double Puntaje;
	
	public JugadorDTO(int documento, String Nombre, int Edad, String Genero, double Puntaje){
		this.documento = documento;
		this.Nombre = Nombre;
		this.Edad = Edad;
		this.Genero = Genero;
		this.Puntaje = Puntaje;
	}

	
	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}


	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public double getPuntaje() {
		return Puntaje;
	}

	public void setPuntaje(double puntaje) {
		Puntaje = puntaje;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		return 
				"Documento:"+this.documento+
				"Nombre:"+this.Nombre+
				"\nEdad:"+this.Edad+
				"\nGenero:"+this.Genero+
				"\nPuntaje:"+this.Puntaje;
	}
}