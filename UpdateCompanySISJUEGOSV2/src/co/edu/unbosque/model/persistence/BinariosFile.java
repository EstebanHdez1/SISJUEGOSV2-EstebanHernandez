package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextArea;



// En esta clase se implementan los métodos básicos de lectura y escritura
// de los dos ejemplos de clase, por esta razón, van aquí.

public class BinariosFile {

	private String rutaJug = "./data/Jugadores.out";
	private String rutaJue = "./data/Juego.out";
	private String rutaPar = "./data/Partida.out";
	private String rutaTor = "./data/Torneo.out";

	private ArrayList<PartidaDTO> Partida;
	private ArrayList<JugadorDTO> Jugador;
	private ArrayList<JuegoDTO> Juego;
	private ArrayList<TorneoDTO> Torneo;
	private PartidaDAO ParDAO;
	private JugadorDAO JugDAO;
	private JuegoDAO JueDAO;
	private TorneoDAO TorDAO;

	public BinariosFile() {
		// TODO Auto-generated constructor stub

		Partida = new ArrayList<>();
		Jugador = new ArrayList<>();
		Juego = new ArrayList<>();
		Torneo = new ArrayList<>();
		ParDAO = new PartidaDAO();
		JugDAO = new JugadorDAO();
		JueDAO = new JuegoDAO();
		TorDAO = new TorneoDAO();

	}

	public String escribirPartida(double juego, String tipoPartida, String jugador1, String jugador2, double puntaje1,
			double puntaje2) {
		String mensaje = "Registro de Partida Ingresado!";
		ParDAO.crearPartida(juego, tipoPartida, jugador1, jugador2, puntaje1, puntaje2);
		Partida = ParDAO.getPartidas();
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaPar));
			out.writeObject(Partida);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	


	public void leerPartida() {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaPar));
			Partida = (ArrayList<PartidaDTO>) in.readObject();
			in.close();
			for (int i = 0; i < Partida.size(); i++) {
				System.out.println(Partida.get(i).getJuego());
				System.out.println(Partida.get(i).getTipoPartida());
				System.out.println(Partida.get(i).getJugador1());
				System.out.println(Partida.get(i).getJugador2());
				System.out.println(Partida.get(i).getPuntaje1());
				System.out.println(Partida.get(i).getPuntaje2());
			}

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Partida);
	}

	public String escribirJugador(int Documento1, int Documento2, String Nombre1, int Edad1, String Genero1,
			double Puntaje1, String Nombre2, int Edad2, String Genero2, double Puntaje2) {
		String mensaje = "Registro de Jugador Ingresado!";
		JugDAO.crearJugador(Documento1, Nombre1, Edad1, Genero1, Puntaje1);
		JugDAO.crearJugador(Documento2, Nombre2, Edad2, Genero2, Puntaje2);
		Jugador = JugDAO.getJugadores();
		try {

			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaJug));
			out.writeObject(Jugador);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}

	public void leerJugador() {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaJug));
			Jugador = (ArrayList<JugadorDTO>) in.readObject();
			in.close();
			for (int i = 0; i < Jugador.size(); i++) {
				System.out.println(Jugador.get(i).getDocumento());
				System.out.println(Jugador.get(i).getNombre());
				System.out.println(Jugador.get(i).getEdad());
				System.out.println(Jugador.get(i).getGenero());
				System.out.println(Jugador.get(i).getPuntaje());
			}

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String escribirJuego(String nombre, String tipo) {
		String mensaje = "Registro de Juego Ingresado!";
		JueDAO.crearPartida(nombre, tipo);
		Juego = JueDAO.getJuegos();
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaJue));
			out.writeObject(Juego);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}

	public void leerJuego() {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaJue));
			Juego = (ArrayList<JuegoDTO>) in.readObject();
			in.close();
			for (int i = 0; i < Juego.size(); i++) {
				System.out.println(Juego.get(i).getNombre());
				System.out.println(Juego.get(i).getTipo());
			}

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String escribirTorneo(String nombret) {
		String mensaje = "Registro de Torneo Ingresado!";
		TorDAO.crearTorneo(nombret);
		Torneo = TorDAO.getTorneos();
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaTor));
			out.writeObject(Torneo);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public void leerTorneo() {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaTor));
			Torneo = (ArrayList<TorneoDTO>) in.readObject();
			in.close();
			for (int i = 0; i < Torneo.size(); i++) {
				System.out.println(Torneo.get(i).getNombret());
			}

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

	public String getRutaJug() {
		return rutaJug;
	}

	public void setRutaJug(String rutaJug) {
		this.rutaJug = rutaJug;
	}

	public String getRutaJue() {
		return rutaJue;
	}

	public void setRutaJue(String rutaJue) {
		this.rutaJue = rutaJue;
	}

	public String getRutaPar() {
		return rutaPar;
	}

	public void setRutaPar(String rutaPar) {
		this.rutaPar = rutaPar;
	}

	public ArrayList<PartidaDTO> getPartida() {
		return Partida;
	}

	public void setPartida(ArrayList<PartidaDTO> partida) {
		Partida = partida;
	}

	public ArrayList<JugadorDTO> getJugador() {
		return Jugador;
	}

	public void setJugador(ArrayList<JugadorDTO> jugador) {
		Jugador = jugador;
	}

	public ArrayList<JuegoDTO> getJuego() {
		return Juego;
	}

	public void setJuego(ArrayList<JuegoDTO> juego) {
		Juego = juego;
	}

	public String getRutaTor() {
		return rutaTor;
	}

	public void setRutaTor(String rutaTor) {
		this.rutaTor = rutaTor;
	}

	public ArrayList<TorneoDTO> getTorneo() {
		return Torneo;
	}

	public void setTorneo(ArrayList<TorneoDTO> torneo) {
		Torneo = torneo;
	}

	public String escribirTorneo(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
