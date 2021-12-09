package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.model.Binarios;
import co.edu.unbosque.model.persistence.JugadorDTO;
import co.edu.unbosque.view.View1;
import co.edu.unbosque.view.View2;
import co.edu.unbosque.view.View3;

public class Controller implements ActionListener {

	// Atributos que vienen del Modelo (mundo)
	private Binarios bd;

	// Atributos que vienen de Vista - gui1
	private View1 gui1;
	private View2 gui2;
	private View3 gui3;

	public Controller() {

		// aqui van los constructores tanto de Mundo, como de Vista

		bd = new Binarios();
		// se Modifica contructor de Interfazgui1 para que reciba como parámetro la
		// instancia de Controlador
		gui1 = new View1(this);
		gui2 = new View2(this);
		gui3 = new View3(this);
		gui2.setVisible(false);
		gui3.setVisible(false);
		gui1.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String resultado = "";

		if (evento.getActionCommand().equals(gui1.getPanelEntrada().ESCRIBIR_REG)) {

			gui1.escribirMensaje(bd.getBf().escribirPartida(
					Double.parseDouble(gui1.getPanelEntrada().getTxtJuego().getSelectedItem().toString()),
					gui1.getPanelEntrada().getTxtTipo().getText(), gui1.getPanelEntrada().getNombreJ1().getText(),
					gui1.getPanelEntrada().getNombreJ2().getText(),
					Double.parseDouble(gui1.getPanelEntrada().getPuntajeJ1().getText()),
					Double.parseDouble(gui1.getPanelEntrada().getPuntajeJ2().getText())));
			gui1.escribirMensaje(
					bd.getBf().escribirJugador(Integer.parseInt(gui1.getPanelEntrada().getDocumentoJ1().getText()),
							Integer.parseInt(gui1.getPanelEntrada().getDocumentoJ2().getText()),
							gui1.getPanelEntrada().getNombreJ1().getText(),
							Integer.parseInt(gui1.getPanelEntrada().getEdadJ1().getText()),
							gui1.getPanelEntrada().getGeneroJ1().getSelectedItem().toString(),
							Double.parseDouble(gui1.getPanelEntrada().getPuntajeJ1().getText()),
							gui1.getPanelEntrada().getNombreJ2().getText(),
							Integer.parseInt(gui1.getPanelEntrada().getEdadJ2().getText()),
							gui1.getPanelEntrada().getGeneroJ2().getSelectedItem().toString(),
							Double.parseDouble(gui1.getPanelEntrada().getPuntajeJ2().getText())));
			gui1.escribirMensaje(
					bd.getBf().escribirJuego(gui1.getPanelEntrada().getTxtNJuego().getSelectedItem().toString(),
							gui1.getPanelEntrada().getTxtTipo().getText()));
		}

		if (evento.getActionCommand().equals(gui1.getPanelEntrada().LEER_REG)) {

			bd.getBf().leerPartida();
			bd.getBf().leerJugador();
			bd.getBf().leerJuego();
			bd.getBf().leerTorneo();
			gui1.mostrarPartida(bd.getBf().getPartida());
			gui1.mostrarJugador(bd.getBf().getJugador());
			gui1.mostrarJuego(bd.getBf().getJuego());
			gui3.mostrarTorneo(bd.getBf().getTorneo());
		}
        //--------------
		if (evento.getActionCommand().equals(gui1.getPanelEntrada().TOR)) {

			gui3.setVisible(true);
			gui3.getTpane().getToolTipText();

		}
		
		if (evento.getActionCommand().equals(gui1.getPanelEntrada().ACT_REG)) {

			gui2.setVisible(true);
			gui2.getApane().getTxtBdocumento().setText("");
			gui2.getApane().getTxtdocumento().setText("");
			gui2.getApane().getTxtnombre().setText("");
			gui2.getApane().getTxtgenero().setText("");
			gui2.getApane().getTxtedad().setText("");
			gui2.getApane().getTxtpuntaje().setText("");

		}
		//------------

		if (evento.getActionCommand().equals(gui2.getApane().BUSCAR_JUG)) {

			gui2.buscarJugador(bd.getBf().getJugador());

		}
		
	//	if (evento.getActionCommand().equals(gui3.getTpane().LEER_Tor)) {
			
	//		bd.getBf().leerTorneo();
	//		gui3.mostrarTorneo(bd.getBf().getTorneo());
			
	//	}
		
		if (evento.getActionCommand().equals(gui3.getPanelTorneo().GUARDAR_Tor)) {

			gui3.escribirMensajet(bd.getBf().escribirTorneo(
					gui3.getPanelTorneo().getNombrec()));
			gui3.escribirMensajet(
					bd.getBf().escribirTorneo(gui3.getPanelTorneo().getNombrec()));
			gui3.escribirMensajet(
					bd.getBf().escribirJuego(gui3.getPanelTorneo().toString(),
							gui3.getPanelTorneo().getNombrec().getToolTipText()));
		}
		
	}

}
