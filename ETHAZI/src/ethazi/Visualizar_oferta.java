package etx;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.ScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Color;

public class Visualizar_oferta {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visualizar_oferta window = new Visualizar_oferta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Visualizar_oferta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 641, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnAlbokaSoftEs_1 = new JTextPane();
		txtpnAlbokaSoftEs_1.setText("Alboka Soft es una empresa joven de ingenier\u00EDa inform\u00E1tica fundada en Diciembre de 2012, especializada en la consultor\u00EDa, dise\u00F1o, construcci\u00F3n e implantaci\u00F3n de soluciones inform\u00E1ticas.");
		txtpnAlbokaSoftEs_1.setBounds(525, 56, 100, 213);
		frame.getContentPane().add(txtpnAlbokaSoftEs_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setToolTipText("u");
		scrollBar.setBackground(Color.MAGENTA);
		scrollBar.setForeground(Color.LIGHT_GRAY);
		scrollBar.setBounds(503, 80, 17, 150);
		frame.getContentPane().add(scrollBar);
		
		JLabel lblOferta = new JLabel("Programador .NET");
		lblOferta.setBounds(23, 21, 121, 24);
		frame.getContentPane().add(lblOferta);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 38, 133, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblDescripcionDeLa = new JLabel("Requisitos");
		lblDescripcionDeLa.setBounds(23, 56, 121, 14);
		frame.getContentPane().add(lblDescripcionDeLa);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 68, 133, 2);
		frame.getContentPane().add(separator_1);
		
		JTextPane txtpnAlbokaSoftEs = new JTextPane();
		txtpnAlbokaSoftEs.setText("Buscamos incorporar un Programador .NET/JAVA que se una a nuestro equipo de desarrollo, dentro de un buen ambiente de trabajo. \r\nSolicitamos profesionales con una experiencia m\u00EDnima de 2 a\u00F1os en el siguiente entorno:\r\nEntorno .NET\r\n- C#, ASP.NET, Visual Basic.NET, VB 6.0\r\n- Experiencia en entorno Microsoft Visual Studio 2012\r\n- Experiencia en Microsoft SQL Server 2008\r\n- Experiencia en Microsoft SQL Server Integration Services (SSIS)\r\n- Experiencia en desarrollo de Web Services con .NET\r\n- Experiencia con .NET Framework 4.5.");
		txtpnAlbokaSoftEs.setBounds(23, 81, 497, 150);
		frame.getContentPane().add(txtpnAlbokaSoftEs);
		
		JToggleButton tglbtnVolver = new JToggleButton("Mandar Solicitud");
		tglbtnVolver.setBounds(482, 314, 121, 23);
		frame.getContentPane().add(tglbtnVolver);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(0, 0, 84, 23);
		frame.getContentPane().add(btnVolver);
		
		JLabel lblRequisitos = new JLabel("Descripcion de la oferta");
		lblRequisitos.setBounds(23, 242, 133, 14);
		frame.getContentPane().add(lblRequisitos);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(23, 254, 133, 2);
		frame.getContentPane().add(separator_2);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(503, 262, 17, 48);
		frame.getContentPane().add(scrollBar_1);
		
		JTextPane txtpnTipoDeIndustria = new JTextPane();
		txtpnTipoDeIndustria.setText("Tipo de industria de la oferta \r\nProgramas inform\u00E1ticos\r\nCategor\u00EDa \r\nInform\u00E1tica y telecomunicaciones - Programaci\u00F3n \r\nNivel \r\nEmpleado/a\r\nPersonal a cargo \r\n0\r\nN\u00FAmero de vacantes \r\n1\r\nHorario \r\n8:00 a 15:45 \r\nSalario \r\nSalario: 21.000\u20AC - 27.000\u20AC Bruto/a\u00F1o\r\nBeneficios sociales \r\nFlexibilidad horaria y organizativa");
		txtpnTipoDeIndustria.setToolTipText("");
		txtpnTipoDeIndustria.setBounds(23, 262, 497, 48);
		frame.getContentPane().add(txtpnTipoDeIndustria);
		
		JLabel lblSobreLaEmpresa = new JLabel("Sobre la empresa");
		lblSobreLaEmpresa.setBounds(525, 38, 100, 14);
		frame.getContentPane().add(lblSobreLaEmpresa);
		
		JButton btnIrALa = new JButton("Ir a la empresa");
		btnIrALa.setBounds(525, 262, 99, 23);
		frame.getContentPane().add(btnIrALa);
	}
}
