package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public class JugadorDAO {
	
	private ArrayList<JugadorDTO> jugadores;

	public JugadorDAO() {
		jugadores = new ArrayList<>();
	}

	public void crearJugador(int documento, String Nombre, int Edad, String Genero, double Puntaje) {
		JugadorDTO jugador = new JugadorDTO(documento, Nombre, Edad, Genero, Puntaje);
		jugadores.add(jugador);
		System.out.println(jugadores);
		System.out.println("Jugador agregado");
	}

	public ArrayList<JugadorDTO> LeerJugador() {
		return jugadores;
	}
	
	public void actualizarJugador(int id, String Nombre, int Edad, String Genero, int Puntaje) {
		jugadores.get(jugadores.indexOf(id)).setNombre(Nombre);
		jugadores.get(jugadores.indexOf(id)).setEdad(Edad);
		jugadores.get(jugadores.indexOf(id)).setGenero(Genero);
		jugadores.get(jugadores.indexOf(id)).setPuntaje(Puntaje);
	}

	public ArrayList<JugadorDTO> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<JugadorDTO> jugadores) {
		this.jugadores = jugadores;
	}

}
