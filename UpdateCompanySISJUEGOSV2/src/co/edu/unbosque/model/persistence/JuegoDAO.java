package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class JuegoDAO {

	private ArrayList<JuegoDTO> juegos;

	public JuegoDAO() {
		juegos = new ArrayList<>();
	}

	public void crearPartida(String nombre, String tipo) {
		JuegoDTO juego= new JuegoDTO(nombre, tipo);
		juegos.add(juego);
		System.out.println(juegos);
		System.out.println("Juego Agregado");
	}

	public ArrayList<JuegoDTO> LeerJuegos() {
		return juegos;
	}

	public ArrayList<JuegoDTO> getJuegos() {
		return juegos;
	}

	public void setJuegos(ArrayList<JuegoDTO> juegos) {
		this.juegos = juegos;
	}
	
	
}
