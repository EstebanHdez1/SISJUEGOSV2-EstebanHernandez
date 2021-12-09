package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class PartidaDAO {

	private ArrayList<PartidaDTO> partidas;

	public PartidaDAO() {
		partidas = new ArrayList<>();
	}

	public void crearPartida(double juego, String tipoPartida, String jugador1, String jugador2, double puntaje1,
			double puntaje2) {
		PartidaDTO partida = new PartidaDTO(juego, tipoPartida, jugador1, jugador2, puntaje1, puntaje2);
		partidas.add(partida);
		System.out.println(partidas);
		System.out.println("Partida agregada");
	}

	public ArrayList<PartidaDTO> LeerPartida() {
		return partidas;
	}

	public ArrayList<PartidaDTO> getPartidas() {
		return partidas;
	}

	public void setPartidas(ArrayList<PartidaDTO> partidas) {
		this.partidas = partidas;
	}
	
	
}
