package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.JuegoDTO;
import co.edu.unbosque.model.persistence.JugadorDTO;
import co.edu.unbosque.model.persistence.TorneoDTO;

public class View3 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLayeredPane lpane;
	private PanelTorneo Tpane;
	private PanelTorneo panelTorneo;
	
	public View3(Controller control) {

		setSize(500, 200);
		setResizable(false);
		setTitle("Torneos");
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		lpane = new JLayeredPane();
		getContentPane().add(lpane, BorderLayout.CENTER);
		lpane.setBounds(0, 0, 500, 250);

		Tpane = new PanelTorneo();
		Tpane.setBounds(0, 0, 500, 250);
		Tpane.setOpaque(false);
		lpane.add(Tpane, 0);

		Tpane.getButLeer().addActionListener(control);
	}
	
	public void buscarTorneo(ArrayList<TorneoDTO> Torneos) {
		for (int i = 0; i < Torneos.size(); i++) {
			if (Torneos.get(i).getNombret() == (Tpane.getNombrec())) {
				
			}
		}
	}

	public JLayeredPane getLpane() {
		return lpane;
	}

	public void setLpane(JLayeredPane lpane) {
		this.lpane = lpane;
	}

	public PanelTorneo getTpane() {
		return Tpane;
	}

	public void setTpane(PanelTorneo tpane) {
		Tpane = tpane;
	}
	
	
	
	public void escribirMensajet(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public PanelTorneo getPanelTorneo() {
		return panelTorneo;
	}

	public void setPanelTorneo(PanelTorneo panelTorneo) {
		this.panelTorneo = panelTorneo;
	}

	public void mostrarTorneo(ArrayList<TorneoDTO> tor) {
		getPanelTorneo().getToolTipText();
		
		for (int i = 0; i < tor.size(); i++) {
		//	getPanelTorneo().getToolTipText().append(String.valueOf(tor.get(i).getNombret()) + "\n");
		}
	}
	
	
}
