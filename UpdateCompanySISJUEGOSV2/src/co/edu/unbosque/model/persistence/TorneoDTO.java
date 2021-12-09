package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class TorneoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombret;
	
	public TorneoDTO(String jTextArea) {
		this.nombret = jTextArea;
	}
	
	
	
	public String getNombret() {
		return nombret;
	}

	public void setNombret(String nombret) {
		this.nombret = nombret;
	}

	public String toString() {
		return "nombre:"+this.nombret;
	}
	
}
