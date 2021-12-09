package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTorneo extends JPanel{

	private JLabel Nombret;
	//private JTextField txtnombret;
	private JButton butGuardar;
	private JButton butActua;
	private JButton butLeer;
	private JComboBox<String> Nombrec;
	public static final String GUARDAR_Tor = "GuardarReg";
	public static final String LEER_Tor = "LeerReg";
	public static final String Actua = "Actu";
	
	public PanelTorneo(){
		
		setLayout(null);
		
		butActua = new JButton("Cerrar");
		butActua.setBounds(30, 90, 140, 20);
		butActua.setActionCommand(Actua);
		
		butGuardar = new JButton("Guardar");
		butGuardar.setBounds(300, 90, 140, 20);
		butGuardar.setActionCommand(GUARDAR_Tor);
		
		butLeer = new JButton("Leer");
		butLeer.setBounds(190, 90, 90, 20);
		butLeer.setActionCommand(LEER_Tor);
		
		Nombret = new JLabel("Nombre");
		Nombret.setFont(new Font("Arial", Font.BOLD, 13));
		Nombret.setForeground(Color.BLACK);
		Nombret.setBounds(190, 30, 100, 20);
		
		Nombrec = new JComboBox<String>();
		Nombrec.setBounds(190, 60, 90, 20);
		Nombrec.addItem("");
		Nombrec.addItem("Torneo fase A");
		Nombrec.addItem("Torneo fase B");
		Nombrec.addItem("Torneo fase C");
		
		
		add(butLeer);
		add(butGuardar);
		add(butActua);
		add(Nombret);
		//add(txtnombret);
		add(Nombrec);
		
	}

	

	public JLabel getNombret() {
		return Nombret;
	}

	public void setNombret(JLabel nombret) {
		Nombret = nombret;
	}

	public JComboBox<String> getNombrec() {
		return Nombrec;
	}

	public void setNombrec(JComboBox<String> nombrec) {
		Nombrec = nombrec;
	}

	public JButton getButGuardar() {
		return butGuardar;
	}

	public void setButGuardar(JButton butGuardar) {
		this.butGuardar = butGuardar;
	}

	public JButton getbutActua() {
		return butActua;
	}

	public void setbutActua(JButton butActua) {
		this.butActua = butActua;
	}

	public JButton getButLeer() {
		return butLeer;
	}

	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}
	

	
	
	
}
