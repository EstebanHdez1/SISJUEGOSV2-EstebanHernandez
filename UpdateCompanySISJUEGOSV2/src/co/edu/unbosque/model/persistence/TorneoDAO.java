package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class TorneoDAO {

	private ArrayList<TorneoDTO> Torneos;

	public TorneoDAO() {
		Torneos = new ArrayList<>();
	}

	public void crearTorneo(String nombre) {
		TorneoDTO torneo= new TorneoDTO(nombre);
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

	public void actualizarTorneo(String nombre) {
		Torneos.get(Torneos.indexOf(nombre)).setNombret(nombre);
	}
	
	public void setTorneos(ArrayList<TorneoDTO> Torneos) {
		this.Torneos = Torneos;
	}

	
}
