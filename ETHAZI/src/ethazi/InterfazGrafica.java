package ethazi;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class InterfazGrafica extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCorreo;
	private JTextField txtContrasea_1;
	private JTextField txtContrasea;
	private JPasswordField passwordField;
	private JLabel label;
	private JLabel lblAunNoEres;
	private JLabel lblRegstrate;
	private JButton btnIniciarSesin;
	private JPanel registrarse;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JPanel registrarCandidato;
	private JLabel lblNombreDeUsuario_1;
	private JLabel lblCorreoElectronico_1;
	private JLabel lblContrasea_1;
	private JLabel lblConfirmarContrasea_1;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblDireccin;
	private JLabel lblFechaDeNacimiento;
	private JLabel lblPermisoDeConducir;
	private JLabel lblCochePropio;
	private JLabel lblNewLabel;
	private JLabel lblEstudios;
	private JLabel lblAosDeExperiencia;
	private JLabel label_1;
	private JPanel registrarEmpresa;
	private JButton btnAtras;
	private JTextField textField_10;
	private JTextField textField_11;
	private JPasswordField passwordField_3;
	private JPasswordField passwordField_4;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JLabel lblConocimientos;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JMenu mnHosteleria;
	private JCheckBox chckbxBarra;
	private JCheckBox chckbxCocina;
	private JCheckBox chckbxTerrraza;
	private JCheckBox chckbxPasteleria;
	private JCheckBox chckbxCocteleria;
	private JMenu mnInformatica;
	private JCheckBox chckbxProgramador;
	private JCheckBox chckbxAnalista;
	private JCheckBox chckbxDiseadorWeb;
	private JCheckBox chckbxCiberseguridad;
	private JMenu mnDiseoGrafico;
	private JCheckBox chckbxDeliniante;
	private JCheckBox chckbxDibujante;
	private JCheckBox chckbxDiseador;
	private JMenu mnJardineria;
	private JCheckBox chckbxPodador;
	private JCheckBox chckbxEncargado;
	private JMenu mnConstruccion;
	private JCheckBox chckbxCarpinteria;
	private JCheckBox chckbxSoldadura;
	private JCheckBox chckbxAlbail;
	private JMenu mnNewMenu;
	private JCheckBox chckbxMilitar;
	private JCheckBox chckbxInteligencia;
	private JCheckBox chckbxRanger;
	private JCheckBox chckbxMarine;
	private JMenuBar menuBar;
	private JMenuBar menuBar_1;
	private JMenuBar menuBar_2;
	private JMenuBar menuBar_3;
	private JMenuBar menuBar_4;
	private JMenuBar menuBar_5;
	private JMenuBar menuBar_6;
	private JMenuBar menuBar_7;
	private JMenuBar menuBar_8;
	private JMenuBar menuBar_9;
	private JMenuBar menuBar_10;
	private JMenuBar menuBar_11;
	private JMenu mnTransportes;
	private JCheckBox chckbxTaxi;
	private JCheckBox chckbxCamin;
	private JCheckBox chckbxTransportista;
	private JCheckBox chckbxChofer;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JMenu mnNewMenu_5;
	private JCheckBox chckbxProfesor;
	private JCheckBox chckbxAtencionEspecial;
	private JCheckBox chckbxCuidador;
	private JCheckBox chckbxDibujante_1;
	private JCheckBox chckbxDeliniante_1;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxSherif;
	private JCheckBox chckbxGuardabosques;
	private JCheckBox chckbxCompositor;
	private JCheckBox chckbxCantante;
	private JCheckBox chckbxTecnicoDeSonido;
	private JCheckBox chckbxTecnicoDeLuces;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxCardio;
	private JCheckBox chckbxTonificacion;
	private JPanel panel_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica frame = new InterfazGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 728);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		
		
		JPanel identificarse = new JPanel();
		identificarse.setBackground(Color.WHITE);
		identificarse.setForeground(Color.BLACK);
		contentPane.add(identificarse, "name_9152758143014");
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(182, 233, 187, 33);
		txtCorreo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtCorreo.setText("");
			}
		});
		identificarse.setLayout(null);
		
		txtContrasea_1 = new JTextField();
		txtContrasea_1.setBounds(0, 0, 0, 0);
		identificarse.add(txtContrasea_1);
		txtContrasea_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 282, 187, 33);
		identificarse.add(passwordField);
		
		JLabel lblVitelotte = new JLabel("VITELOTTE");
		lblVitelotte.setBounds(251, 49, 64, 63);
		identificarse.add(lblVitelotte);
		passwordField.setVisible(false);
		
		txtCorreo.setText("Correo electronico/usuario");
		identificarse.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setBounds(182, 282, 187, 33);
		txtContrasea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtContrasea.setText("");
				txtContrasea.setVisible(false);
				passwordField.setVisible(true);
			}
		});
		txtContrasea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtContrasea.setText("");
			}
		});
		txtContrasea.setText("Contrase\u00F1a");
		identificarse.add(txtContrasea);
		txtContrasea.setColumns(10);
		
		label = new JLabel("");
		label.setBounds(387, 301, 21, 14);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setEchoChar((char) 0);
			}
		});
		label.setForeground(Color.WHITE);
		label.setBackground(Color.WHITE);
		label.setIcon(new ImageIcon("C:\\Users\\in1dm3_25\\Downloads\\ojo.png"));
		identificarse.add(label);
		
		lblAunNoEres = new JLabel("Aun no eres miembro?");
		lblAunNoEres.setBounds(23, 454, 147, 51);
		identificarse.add(lblAunNoEres);
		
		lblRegstrate = new JLabel("Reg\u00EDstrate");
		lblRegstrate.setBounds(168, 454, 94, 51);
		lblRegstrate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblRegstrate.setForeground(Color.blue);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblRegstrate.setForeground(Color.black);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				registrarse.setVisible(true);
				identificarse.setVisible(false);
				registrarCandidato.setVisible(false);
				registrarEmpresa.setVisible(false);
			}
		});
		identificarse.add(lblRegstrate);
		
		btnIniciarSesin = new JButton("Iniciar sesi\u00F3n");
		btnIniciarSesin.setBounds(416, 468, 121, 23);
		identificarse.add(btnIniciarSesin);
		
		registrarse = new JPanel();
		contentPane.add(registrarse, "name_9170053928447");
		registrarse.setLayout(null);
		
		JButton btnEmpresa = new JButton("EMPRESA");
		btnEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registrarEmpresa.setVisible(true);
				registrarCandidato.setVisible(false);
			}
		});
		btnEmpresa.setBounds(98, 12, 98, 26);
		registrarse.add(btnEmpresa);
		
		JButton btnCandidato = new JButton("CANDIDATO");
		btnCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrarCandidato.setVisible(true);
				registrarEmpresa.setVisible(false);
			}
		});
		btnCandidato.setBounds(236, 12, 111, 26);
		registrarse.add(btnCandidato);
		
		btnAtras = new JButton("ATRAS");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				identificarse.setVisible(true);
				registrarse.setVisible(false);
				
			}
		});
		btnAtras.setBounds(390, 12, 98, 26);
		registrarse.add(btnAtras);
		
		registrarCandidato = new JPanel();
		registrarCandidato.setBackground(Color.WHITE);
		registrarCandidato.setBounds(0, 46, 590, 634);
		registrarse.add(registrarCandidato);
		registrarCandidato.setLayout(null);
		
		lblNombreDeUsuario_1 = new JLabel("Nombre de usuario*:");
		lblNombreDeUsuario_1.setBounds(12, 25, 163, 16);
		registrarCandidato.add(lblNombreDeUsuario_1);
		
		lblCorreoElectronico_1 = new JLabel("Correo electronico*:");
		lblCorreoElectronico_1.setBounds(12, 53, 121, 16);
		registrarCandidato.add(lblCorreoElectronico_1);
		
		lblContrasea_1 = new JLabel("Contrase\u00F1a*:");
		lblContrasea_1.setBounds(12, 81, 163, 16);
		registrarCandidato.add(lblContrasea_1);
		
		lblConfirmarContrasea_1 = new JLabel("Confirmar contrase\u00F1a*:");
		lblConfirmarContrasea_1.setBounds(12, 109, 188, 16);
		registrarCandidato.add(lblConfirmarContrasea_1);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(12, 139, 55, 16);
		registrarCandidato.add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(12, 172, 55, 16);
		registrarCandidato.add(lblApellidos);
		
		lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(12, 207, 121, 16);
		registrarCandidato.add(lblDireccin);
		
		lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(12, 235, 148, 16);
		registrarCandidato.add(lblFechaDeNacimiento);
		
		lblPermisoDeConducir = new JLabel("Permiso de conducir:");
		lblPermisoDeConducir.setBounds(12, 263, 188, 16);
		registrarCandidato.add(lblPermisoDeConducir);
		
		lblCochePropio = new JLabel("Coche propio:");
		lblCochePropio.setBounds(12, 291, 163, 16);
		registrarCandidato.add(lblCochePropio);
		
		lblNewLabel = new JLabel("Disponibilidad para viajar:");
		lblNewLabel.setBounds(12, 319, 203, 16);
		registrarCandidato.add(lblNewLabel);
		
		lblEstudios = new JLabel("Estudios:");
		lblEstudios.setBounds(12, 347, 55, 16);
		registrarCandidato.add(lblEstudios);
		
		lblAosDeExperiencia = new JLabel("A\u00F1os de experiencia:");
		lblAosDeExperiencia.setBounds(12, 422, 134, 16);
		registrarCandidato.add(lblAosDeExperiencia);
		
		JSlider slider = new JSlider();
		slider.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				label_1.setText(""+slider.getValue());
			}
		});
		slider.setValue(0);
		slider.setMaximum(49);
		slider.setBounds(216, 422, 200, 21);
		registrarCandidato.add(slider);
		
		label_1 = new JLabel("");
		label_1.setBounds(420, 422, 55, 16);
		registrarCandidato.add(label_1);
		
		textField_10 = new JTextField();
		textField_10.setBounds(251, 23, 114, 20);
		registrarCandidato.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(251, 51, 114, 20);
		registrarCandidato.add(textField_11);
		textField_11.setColumns(10);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(251, 79, 114, 18);
		registrarCandidato.add(passwordField_3);
		
		passwordField_4 = new JPasswordField();
		passwordField_4.setBounds(251, 107, 114, 18);
		registrarCandidato.add(passwordField_4);
		
		textField_12 = new JTextField();
		textField_12.setBounds(251, 137, 114, 21);
		registrarCandidato.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(251, 170, 114, 20);
		registrarCandidato.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(251, 205, 114, 20);
		registrarCandidato.add(textField_14);
		textField_14.setColumns(10);
		
		JRadioButton rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setBounds(229, 259, 64, 24);
		registrarCandidato.add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(297, 259, 55, 24);
		registrarCandidato.add(rdbtnNo);
		
		JRadioButton rdbtnSi_1 = new JRadioButton("Si");
		rdbtnSi_1.setBounds(229, 287, 64, 24);
		registrarCandidato.add(rdbtnSi_1);
		
		JRadioButton rdbtnNo_1 = new JRadioButton("No");
		rdbtnNo_1.setBounds(297, 287, 121, 24);
		registrarCandidato.add(rdbtnNo_1);
		
		JRadioButton rdbtnSi_2 = new JRadioButton("Si");
		rdbtnSi_2.setBounds(229, 315, 64, 24);
		registrarCandidato.add(rdbtnSi_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("No");
		rdbtnNewRadioButton.setBounds(297, 315, 55, 24);
		registrarCandidato.add(rdbtnNewRadioButton);
		
		textField_15 = new JTextField();
		textField_15.setBounds(216, 347, 313, 63);
		registrarCandidato.add(textField_15);
		textField_15.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(251, 231, 207, 20);
		registrarCandidato.add(dateChooser);
		
		lblConocimientos = new JLabel("Conocimientos:");
		lblConocimientos.setBounds(12, 443, 121, 16);
		registrarCandidato.add(lblConocimientos);
		
		panel = new JPanel();
		panel.setBounds(12, 464, 103, 24);
		registrarCandidato.add(panel);
		
		menuBar_2 = new JMenuBar();
		panel.add(menuBar_2);
		
		mnHosteleria = new JMenu("Hosteleria");
		menuBar_2.add(mnHosteleria);
		
		chckbxBarra = new JCheckBox("Barra");
		mnHosteleria.add(chckbxBarra);
		
		chckbxCocina = new JCheckBox("Cocina");
		mnHosteleria.add(chckbxCocina);
		
		chckbxTerrraza = new JCheckBox("Terrraza");
		mnHosteleria.add(chckbxTerrraza);
		
		chckbxPasteleria = new JCheckBox("Pasteleria");
		mnHosteleria.add(chckbxPasteleria);
		
		chckbxCocteleria = new JCheckBox("Cocteleria");
		mnHosteleria.add(chckbxCocteleria);
		
		panel_1 = new JPanel();
		panel_1.setBounds(12, 488, 103, 24);
		registrarCandidato.add(panel_1);
		
		menuBar_3 = new JMenuBar();
		panel_1.add(menuBar_3);
		
		mnInformatica = new JMenu("Informatica");
		menuBar_3.add(mnInformatica);
		
		chckbxProgramador = new JCheckBox("Programador");
		mnInformatica.add(chckbxProgramador);
		
		chckbxAnalista = new JCheckBox("Analista");
		mnInformatica.add(chckbxAnalista);
		
		chckbxDiseadorWeb = new JCheckBox("Dise\u00F1ador web");
		mnInformatica.add(chckbxDiseadorWeb);
		
		chckbxCiberseguridad = new JCheckBox("Ciberseguridad");
		mnInformatica.add(chckbxCiberseguridad);
		
		panel_2 = new JPanel();
		panel_2.setBounds(12, 512, 103, 24);
		registrarCandidato.add(panel_2);
		
		menuBar_4 = new JMenuBar();
		panel_2.add(menuBar_4);
		
		mnDiseoGrafico = new JMenu("Dise\u00F1o grafico");
		menuBar_4.add(mnDiseoGrafico);
		
		chckbxDeliniante = new JCheckBox("Deliniante");
		mnDiseoGrafico.add(chckbxDeliniante);
		
		chckbxDibujante = new JCheckBox("Dibujante");
		mnDiseoGrafico.add(chckbxDibujante);
		
		chckbxDiseador = new JCheckBox("Dise\u00F1ador");
		mnDiseoGrafico.add(chckbxDiseador);
		
		panel_3 = new JPanel();
		panel_3.setBounds(12, 538, 103, 24);
		registrarCandidato.add(panel_3);
		
		menuBar_5 = new JMenuBar();
		panel_3.add(menuBar_5);
		
		mnJardineria = new JMenu("Jardineria");
		menuBar_5.add(mnJardineria);
		
		chckbxPodador = new JCheckBox("Podador");
		mnJardineria.add(chckbxPodador);
		
		chckbxEncargado = new JCheckBox("Encargado");
		mnJardineria.add(chckbxEncargado);
		
		panel_4 = new JPanel();
		panel_4.setBounds(12, 563, 103, 24);
		registrarCandidato.add(panel_4);
		
		menuBar_1 = new JMenuBar();
		panel_4.add(menuBar_1);
		
		mnConstruccion = new JMenu("Construccion");
		menuBar_1.add(mnConstruccion);
		
		chckbxCarpinteria = new JCheckBox("Carpinteria");
		mnConstruccion.add(chckbxCarpinteria);
		
		chckbxSoldadura = new JCheckBox("Soldadura");
		mnConstruccion.add(chckbxSoldadura);
		
		chckbxAlbail = new JCheckBox("Alba\u00F1il");
		mnConstruccion.add(chckbxAlbail);
		
		panel_5 = new JPanel();
		panel_5.setBounds(0, 587, 163, 24);
		registrarCandidato.add(panel_5);
		
		menuBar = new JMenuBar();
		panel_5.add(menuBar);
		
		mnNewMenu = new JMenu("Fuerzas especiales");
		menuBar.add(mnNewMenu);
		
		chckbxMilitar = new JCheckBox("Militar");
		mnNewMenu.add(chckbxMilitar);
		
		chckbxInteligencia = new JCheckBox("Inteligencia");
		mnNewMenu.add(chckbxInteligencia);
		
		chckbxMarine = new JCheckBox("Marine");
		mnNewMenu.add(chckbxMarine);
		
		chckbxRanger = new JCheckBox("Ranger");
		mnNewMenu.add(chckbxRanger);
		
		panel_6 = new JPanel();
		panel_6.setBounds(197, 464, 103, 24);
		registrarCandidato.add(panel_6);
		
		menuBar_6 = new JMenuBar();
		panel_6.add(menuBar_6);
		
		mnTransportes = new JMenu("Transportes");
		menuBar_6.add(mnTransportes);
		
		chckbxCamin = new JCheckBox("Cami\u00F3n");
		mnTransportes.add(chckbxCamin);
		
		chckbxTransportista = new JCheckBox("Transportista");
		mnTransportes.add(chckbxTransportista);
		
		chckbxChofer = new JCheckBox("Chofer");
		mnTransportes.add(chckbxChofer);
		
		chckbxTaxi = new JCheckBox("Taxi");
		mnTransportes.add(chckbxTaxi);
		
		panel_7 = new JPanel();
		panel_7.setBounds(197, 488, 103, 24);
		registrarCandidato.add(panel_7);
		
		menuBar_7 = new JMenuBar();
		panel_7.add(menuBar_7);
		
		mnNewMenu_1 = new JMenu("Educacion");
		menuBar_7.add(mnNewMenu_1);
		
		chckbxProfesor = new JCheckBox("Profesor");
		mnNewMenu_1.add(chckbxProfesor);
		
		chckbxAtencionEspecial = new JCheckBox("Atencion especial");
		mnNewMenu_1.add(chckbxAtencionEspecial);
		
		chckbxCuidador = new JCheckBox("Cuidador");
		mnNewMenu_1.add(chckbxCuidador);
		
		panel_8 = new JPanel();
		panel_8.setBounds(197, 512, 103, 24);
		registrarCandidato.add(panel_8);
		
		menuBar_8 = new JMenuBar();
		panel_8.add(menuBar_8);
		
		mnNewMenu_2 = new JMenu("Arte");
		menuBar_8.add(mnNewMenu_2);
		
		chckbxDibujante_1 = new JCheckBox("Dibujante");
		mnNewMenu_2.add(chckbxDibujante_1);
		
		chckbxDeliniante_1 = new JCheckBox("Deliniante");
		mnNewMenu_2.add(chckbxDeliniante_1);
		
		panel_9 = new JPanel();
		panel_9.setBounds(197, 538, 103, 24);
		registrarCandidato.add(panel_9);
		
		menuBar_9 = new JMenuBar();
		panel_9.add(menuBar_9);
		
		mnNewMenu_3 = new JMenu("Defensa");
		menuBar_9.add(mnNewMenu_3);
		
		chckbxNewCheckBox = new JCheckBox("Policia");
		mnNewMenu_3.add(chckbxNewCheckBox);
		
		chckbxSherif = new JCheckBox("Sherif");
		mnNewMenu_3.add(chckbxSherif);
		
		chckbxGuardabosques = new JCheckBox("Guardabosques");
		mnNewMenu_3.add(chckbxGuardabosques);
		
		panel_10 = new JPanel();
		panel_10.setBounds(197, 563, 103, 24);
		registrarCandidato.add(panel_10);
		
		menuBar_10 = new JMenuBar();
		panel_10.add(menuBar_10);
		
		mnNewMenu_4 = new JMenu("Musica");
		menuBar_10.add(mnNewMenu_4);
		
		chckbxCompositor = new JCheckBox("Compositor");
		mnNewMenu_4.add(chckbxCompositor);
		
		chckbxCantante = new JCheckBox("Cantante");
		mnNewMenu_4.add(chckbxCantante);
		
		chckbxTecnicoDeSonido = new JCheckBox("Tecnico de sonido");
		mnNewMenu_4.add(chckbxTecnicoDeSonido);
		
		chckbxTecnicoDeLuces = new JCheckBox("Tecnico de luces");
		mnNewMenu_4.add(chckbxTecnicoDeLuces);
		
		panel_11 = new JPanel();
		panel_11.setBounds(197, 587, 103, 24);
		registrarCandidato.add(panel_11);
		
		menuBar_11 = new JMenuBar();
		panel_11.add(menuBar_11);
		
		mnNewMenu_5 = new JMenu("Deporte");
		menuBar_11.add(mnNewMenu_5);
		
		chckbxNewCheckBox_1 = new JCheckBox("Artes marciales");
		mnNewMenu_5.add(chckbxNewCheckBox_1);
		
		chckbxCardio = new JCheckBox("Cardio");
		mnNewMenu_5.add(chckbxCardio);
		
		chckbxTonificacion = new JCheckBox("Tonificacion");
		mnNewMenu_5.add(chckbxTonificacion);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registrarCandidato.setVisible(false);
				registrarEmpresa.setVisible(false);
				registrarse.setVisible(false);
				identificarse.setVisible(true);
			}
		});
		btnGuardar.setBounds(467, 585, 98, 26);
		registrarCandidato.add(btnGuardar);
		
		registrarEmpresa = new JPanel();
		registrarEmpresa.setBackground(Color.WHITE);
		registrarEmpresa.setBounds(0, 46, 590, 634);
		registrarse.add(registrarEmpresa);
		registrarEmpresa.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(305, 12, 183, 20);
		registrarEmpresa.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario*:");
		lblNombreDeUsuario.setBounds(24, 14, 155, 16);
		registrarEmpresa.add(lblNombreDeUsuario);
		
		textField_2 = new JTextField();
		textField_2.setBounds(305, 44, 183, 20);
		registrarEmpresa.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCorreoElectronico = new JLabel("Correo electronico*:");
		lblCorreoElectronico.setBounds(24, 46, 155, 16);
		registrarEmpresa.add(lblCorreoElectronico);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(305, 76, 183, 20);
		registrarEmpresa.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(305, 108, 183, 20);
		registrarEmpresa.add(passwordField_2);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a*:");
		lblContrasea.setBounds(24, 78, 155, 16);
		registrarEmpresa.add(lblContrasea);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a*:");
		lblConfirmarContrasea.setBounds(24, 110, 155, 16);
		registrarEmpresa.add(lblConfirmarContrasea);
		
		textField_3 = new JTextField();
		textField_3.setBounds(305, 140, 183, 20);
		registrarEmpresa.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(305, 172, 183, 20);
		registrarEmpresa.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(305, 204, 183, 20);
		registrarEmpresa.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(305, 236, 183, 20);
		registrarEmpresa.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la empresa:");
		lblNombreDeLa.setBounds(24, 142, 155, 16);
		registrarEmpresa.add(lblNombreDeLa);
		
		JLabel lblCif = new JLabel("C.I.F.:");
		lblCif.setBounds(24, 174, 55, 16);
		registrarEmpresa.add(lblCif);
		
		JLabel lblDireccionPostal = new JLabel("Direccion postal:");
		lblDireccionPostal.setBounds(24, 206, 132, 16);
		registrarEmpresa.add(lblDireccionPostal);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(24, 238, 172, 16);
		registrarEmpresa.add(lblTelfono);
		
		textField_7 = new JTextField();
		textField_7.setBounds(305, 268, 183, 20);
		registrarEmpresa.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmailRrhh = new JLabel("Email RRHH:");
		lblEmailRrhh.setBounds(24, 270, 172, 16);
		registrarEmpresa.add(lblEmailRrhh);
		
		textField_8 = new JTextField();
		textField_8.setBounds(305, 300, 183, 20);
		registrarEmpresa.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblPersonaDeContacto = new JLabel("Persona de contacto");
		lblPersonaDeContacto.setBounds(24, 302, 172, 16);
		registrarEmpresa.add(lblPersonaDeContacto);
		
		textField_9 = new JTextField();
		textField_9.setBounds(197, 332, 381, 59);
		registrarEmpresa.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblDescripcionDeLa = new JLabel("Descripcion de la empresa:");
		lblDescripcionDeLa.setBounds(24, 334, 172, 16);
		registrarEmpresa.add(lblDescripcionDeLa);
		
		panel_12 = new JPanel();
		contentPane.add(panel_12, "name_12680387628386");
	}
}
