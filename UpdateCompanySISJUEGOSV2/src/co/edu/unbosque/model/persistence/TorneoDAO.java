package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import javax.swing.JComboBox;

public class TorneoDAO {

	private ArrayList<TorneoDTO> Torneos;

	public TorneoDAO() {
		Torneos = new ArrayList<>();
	}

	public void crearTorneo(JComboBox<String> jComboBox) {
		TorneoDTO torneo= new TorneoDTO(jComboBox);
		Torneos.add(torneo);
		System.out.println(Torneos);
		System.out.println("Torneo Agregado");
	}

	public ArrayList<TorneoDTO> LeerTorneos() {
		return Torneos;
	}

	public ArrayList<TorneoDTO> getTorneos() {
		return Torneos;
	}

	public void setTorneos(ArrayList<TorneoDTO> Torneos) {
		this.Torneos = Torneos;
	}

	
}
