package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.BinariosFile;
import co.edu.unbosque.model.persistence.JugadorDAO;

// En este método se implementarían las transacciones que se requieran con los 
// métodos básicos de lectura y escritura de archivos binarios. 

public class Binarios {

	private BinariosFile bf;
	private JugadorDAO jdao;
	
	public Binarios() {
		// TODO Auto-generated constructor stub
		bf = new BinariosFile();
		jdao = new JugadorDAO();
	}

	public BinariosFile getBf() {
		return bf;
	}

	public void setBf(BinariosFile bf) {
		this.bf = bf;
	}
	
	

	public JugadorDAO getJdao() {
		return jdao;
	}

	public void setJdao(JugadorDAO jdao) {
		this.jdao = jdao;
	}

	/* metodo que realiza un proceso basado en un parámetro "dato" 
	 * y retorne el dato procesado. Reemplazar por lo que se necesiten
	 */
	public String procesarDato(String dato) {
		dato = dato + " procesado";
		return dato;
	}
	
	
	
}
