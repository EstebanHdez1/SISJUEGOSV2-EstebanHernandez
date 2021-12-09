package co.edu.unbosque.model.persistence;

import java.io.Serializable;

import javax.swing.JComboBox;

public class TorneoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private JComboBox<String> nombret;
	
	public TorneoDTO(JComboBox<String> string) {
		this.nombret = string;
	}
	
	
	
	public JComboBox<String> getNombret() {
		return nombret;
	}

	public void setNombret(JComboBox<String> nombret) {
		this.nombret = nombret;
	}

	public String toString() {
		return "nombre:"+this.nombret;
	}
	
}
