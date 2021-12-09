package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.JugadorDAO;
import co.edu.unbosque.model.persistence.JugadorDTO;

public class View2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLayeredPane lpane;
	private PanelActualizar apane;

	public View2(Controller control) {

		setSize(700, 200);
		setResizable(false);
		setTitle("Actaulizar Jugador");
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		lpane = new JLayeredPane();
		getContentPane().add(lpane, BorderLayout.CENTER);
		lpane.setBounds(0, 0, 700, 250);

		apane = new PanelActualizar();
		apane.setBounds(0, 0, 700, 250);
		apane.setOpaque(false);
		lpane.add(apane, 0);

		apane.getButBuscar().addActionListener(control);
	}

	public void buscarJugador(ArrayList<JugadorDTO> jugadores) {
		for (int i = 0; i < jugadores.size(); i++) {
			if (jugadores.get(i).getDocumento() == Integer.parseInt(apane.getTxtBdocumento().getText())) {
				
			}
		}
	}

	public JLayeredPane getLpane() {
		return lpane;
	}

	public void setLpane(JLayeredPane lpane) {
		this.lpane = lpane;
	}

	public PanelActualizar getApane() {
		return apane;
	}

	public void setApane(PanelActualizar apane) {
		this.apane = apane;
	}

}
