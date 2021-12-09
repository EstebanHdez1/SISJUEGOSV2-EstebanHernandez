package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.JuegoDTO;
import co.edu.unbosque.model.persistence.JugadorDTO;
import co.edu.unbosque.model.persistence.PartidaDTO;
import co.edu.unbosque.model.persistence.TorneoDTO;

public class View1 extends JFrame {

	// Constante generada por Eclipse
	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada; // Se declara un objeto de tipo PanelEntrada
	private PanelPartida panelPartida;
	private PanelJugador panelJugador;
	private PanelJuego panelJuego;
	private PanelTorneo panelTorneo;

	public View1(Controller control) {
		// Definición de los parámetros básicos de la ventana principal

		setSize(760, 450); // tamaño en ancho y alto en pixeles
		setResizable(false); // Se puede cambiar el tamaño de la ventana?
		setTitle("Sistema de Información Jugadores"); // tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);// qué debe hacer si cierra la ventana
		setLocationRelativeTo(null); // coloca la ventana al centro de la pantalla
		// Establece el layout (lienzo) que vamos a utilizar dentro de la ventana
		// principal.
		setLayout(new BorderLayout());
		// Se agrega al layout en la parte NORTH, el panel de entrada definido
		panelEntrada = new PanelEntrada();
		panelEntrada.setPreferredSize(new Dimension(900, 200));
		add(panelEntrada, BorderLayout.NORTH);
		panelPartida = new PanelPartida();
		add(panelPartida, BorderLayout.WEST);
		panelJugador = new PanelJugador();
		add(panelJugador, BorderLayout.EAST);
		panelJuego = new PanelJuego();
		add(panelJuego, BorderLayout.CENTER);

		panelEntrada.getButLeerReg().addActionListener(control);
		panelEntrada.getButEscribirReg().addActionListener(control);
		panelEntrada.getButActualizarReg().addActionListener(control);
		panelEntrada.getButTorneos().addActionListener(control);
		panelEntrada.getButEscribirReg().addActionListener(control);
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelPartida getPanelPartida() {
		return panelPartida;
	}

	public void setPanelPartida(PanelPartida panelPartida) {
		this.panelPartida = panelPartida;
	}

	public PanelJugador getPanelJugador() {
		return panelJugador;
	}

	public void setPanelJugador(PanelJugador panelJugador) {
		this.panelJugador = panelJugador;
	}

	public PanelJuego getPanelJuego() {
		return panelJuego;
	}

	public void setPanelJuego(PanelJuego panelJuego) {
		this.panelJuego = panelJuego;
	}

	public PanelTorneo getPanelTorneo() {
		return panelTorneo;
	}

	public void setPanelTorneo(PanelTorneo panelTorneo) {
		this.panelTorneo = panelTorneo;
	}
	
	

	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarPartida(ArrayList<PartidaDTO> datos) {
		getPanelPartida().getTxtJuego().setText("");
		getPanelPartida().getTxtTipoPartida().setText("");
		getPanelPartida().getTxtJugador1().setText("");
		getPanelPartida().getTxtJugador2().setText("");
		getPanelPartida().getTxtPuntaje1().setText("");
		getPanelPartida().getTxtPuntaje2().setText("");
		for (int i = 0; i < datos.size(); i++) {
			getPanelPartida().getTxtJuego().append(String.valueOf(datos.get(i).getJuego()) + "\n");
			getPanelPartida().getTxtTipoPartida().append(String.valueOf(datos.get(i).getTipoPartida()) + "\n");
			getPanelPartida().getTxtJugador1().append(String.valueOf(datos.get(i).getJugador1()) + "\n");
			getPanelPartida().getTxtJugador2().append(String.valueOf(datos.get(i).getJugador2()) + "   \n");
			getPanelPartida().getTxtPuntaje1().append(String.valueOf(datos.get(i).getPuntaje1()) + "   \n");
			getPanelPartida().getTxtPuntaje2().append(String.valueOf(datos.get(i).getPuntaje2()) + "\n");
		}
	}

	public void mostrarJugador(ArrayList<JugadorDTO> jug) {
		getPanelJugador().getTxtDocumento().setText("");
		getPanelJugador().getTxtNombre().setText("");
		getPanelJugador().getTxtEdad().setText("");
		getPanelJugador().getTxtGenero().setText("");
		getPanelJugador().getTxtPuntaje().setText("");
		for (int i = 0; i < jug.size(); i++) {
			getPanelJugador().getTxtDocumento().append(String.valueOf(jug.get(i).getDocumento()) + "\n");
			getPanelJugador().getTxtNombre().append(String.valueOf(jug.get(i).getNombre()) + "\n");
			getPanelJugador().getTxtEdad().append(String.valueOf(jug.get(i).getEdad()) + "\n");
			getPanelJugador().getTxtGenero().append(String.valueOf(jug.get(i).getGenero()) + "   \n");
			getPanelJugador().getTxtPuntaje().append(String.valueOf(jug.get(i).getPuntaje()) + "\n");
		}
	}
	
	public void mostrarJuego(ArrayList<JuegoDTO> jue) {
		getPanelJuego().getTxtNombre().setText("");
		getPanelJuego().getTxtTipo().setText("");
		for (int i = 0; i < jue.size(); i++) {
			getPanelJuego().getTxtNombre().append(String.valueOf(jue.get(i).getNombre()) + "\n");
			getPanelJuego().getTxtTipo().append(String.valueOf(jue.get(i).getTipo()) + "\n");
		}
	}
	
	
}
