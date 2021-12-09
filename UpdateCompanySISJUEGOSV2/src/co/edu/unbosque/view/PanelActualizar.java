package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelActualizar extends JPanel{
	
	private JLabel BDocumento;
	private JLabel Documento;
	private JLabel Nombre;
	private JLabel Genero;
	private JLabel Edad;
	private JLabel Puntaje;
	private JTextField txtBdocumento;
	private JTextField txtdocumento;
	private JTextField txtnombre;
	private JTextField txtgenero;
	private JTextField txtedad;
	private JTextField txtpuntaje;
	private JButton butGuardar;
	private JButton butCerrar;
	private JButton butBuscar;
	public static final String GUARDAR_JUG = "GuardarReg";
	public static final String BUSCAR_JUG = "BuscarReg";
	public static final String CERRAR = "Cerrar";
	
	public PanelActualizar(){
		
		setLayout(null);
		
		BDocumento = new JLabel("Documento: ");
		BDocumento.setFont(new Font("Arial", Font.BOLD, 13));
		BDocumento.setForeground(Color.BLACK);
		BDocumento.setBounds(30, 30, 100, 20);
		
		txtBdocumento = new JTextField();
		txtBdocumento.setBounds(30, 60, 100, 20);
		
		butBuscar = new JButton("Buscar Jugador");
		butBuscar.setBounds(30, 90, 140, 20);
		butBuscar.setActionCommand(BUSCAR_JUG);
		
		butGuardar = new JButton("Guardar Jugador");
		butGuardar.setBounds(530, 100, 140, 20);
		butGuardar.setActionCommand(GUARDAR_JUG);
		
		butCerrar = new JButton("Cerrar");
		butCerrar.setBounds(430, 100, 90, 20);
		butCerrar.setActionCommand(CERRAR);
		
		Documento = new JLabel("Documento");
		Documento.setFont(new Font("Arial", Font.BOLD, 13));
		Documento.setForeground(Color.BLACK);
		Documento.setBounds(200, 30, 100, 20);
		
		Nombre = new JLabel("Nombre");
		Nombre.setFont(new Font("Arial", Font.BOLD, 13));
		Nombre.setForeground(Color.BLACK);
		Nombre.setBounds(300, 30, 100, 20);
		
		Genero = new JLabel("Genero");
		Genero.setFont(new Font("Arial", Font.BOLD, 13));
		Genero.setForeground(Color.BLACK);
		Genero.setBounds(400, 30, 100, 20);
		
		Edad = new JLabel("Edad");
		Edad.setFont(new Font("Arial", Font.BOLD, 13));
		Edad.setForeground(Color.BLACK);
		Edad.setBounds(500, 30, 100, 20);
		
		Puntaje = new JLabel("Puntaje");
		Puntaje.setFont(new Font("Arial", Font.BOLD, 13));
		Puntaje.setForeground(Color.BLACK);
		Puntaje.setBounds(600, 30, 100, 20);
		
		txtdocumento = new JTextField();
		txtdocumento.setBounds(190, 60, 90, 20);
		txtdocumento.setBackground(Color.WHITE);
		txtdocumento.setEditable(false);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(290, 60, 90, 20);
		
		txtgenero = new JTextField();
		txtgenero.setBounds(390, 60, 90, 20);
		
		txtedad = new JTextField();
		txtedad.setBounds(490, 60, 90, 20);
		
		txtpuntaje = new JTextField();
		txtpuntaje.setBounds(590, 60, 90, 20);
		
		
		add(BDocumento);
		add(txtBdocumento);
		add(butBuscar);
		add(butGuardar);
		add(butCerrar);
		add(Documento);
		add(Nombre);
		add(Genero);
		add(Edad);
		add(Puntaje);
		add(txtdocumento);
		add(txtnombre);
		add(txtgenero);
		add(txtedad);
		add(txtpuntaje);
		
	}

	public JTextField getTxtBdocumento() {
		return txtBdocumento;
	}

	public void setTxtBdocumento(JTextField txtBdocumento) {
		this.txtBdocumento = txtBdocumento;
	}

	public JTextField getTxtdocumento() {
		return txtdocumento;
	}

	public void setTxtdocumento(JTextField txtdocumento) {
		this.txtdocumento = txtdocumento;
	}

	public JTextField getTxtnombre() {
		return txtnombre;
	}

	public void setTxtnombre(JTextField txtnombre) {
		this.txtnombre = txtnombre;
	}

	public JTextField getTxtgenero() {
		return txtgenero;
	}

	public void setTxtgenero(JTextField txtgenero) {
		this.txtgenero = txtgenero;
	}

	public JTextField getTxtedad() {
		return txtedad;
	}

	public void setTxtedad(JTextField txtedad) {
		this.txtedad = txtedad;
	}

	public JTextField getTxtpuntaje() {
		return txtpuntaje;
	}

	public void setTxtpuntaje(JTextField txtpuntaje) {
		this.txtpuntaje = txtpuntaje;
	}

	public JButton getButGuardar() {
		return butGuardar;
	}

	public void setButGuardar(JButton butGuardar) {
		this.butGuardar = butGuardar;
	}

	public JButton getButCerrar() {
		return butCerrar;
	}

	public void setButCerrar(JButton butCerrar) {
		this.butCerrar = butCerrar;
	}

	public JButton getButBuscar() {
		return butBuscar;
	}

	public void setButBuscar(JButton butBuscar) {
		this.butBuscar = butBuscar;
	}

	public static String getGuardarJug() {
		return GUARDAR_JUG;
	}

	public static String getBuscarJug() {
		return BUSCAR_JUG;
	}

	public static String getCerrar() {
		return CERRAR;
	}
	
	
}

