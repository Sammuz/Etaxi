package etx;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Consultar_conocimientos_adecuados {

	private JFrame frame;
	private JTextField txtBusqueda;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultar_conocimientos_adecuados window = new Consultar_conocimientos_adecuados();
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
	public Consultar_conocimientos_adecuados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 603, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("Conoc. Adecuados");
		btnNewButton_1.setBounds(0, 0, 89, 23);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(88, 0, 89, 23);
		panel.setLayout(null);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setBackground(Color.LIGHT_GRAY);
		txtBusqueda.setText("Busqueda");
		txtBusqueda.setBounds(0, 50, 116, 20);
		panel.add(txtBusqueda);
		txtBusqueda.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 50, 587, 16);
		panel.add(separator);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(99, 67, 17, 293);
		panel.add(scrollBar);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(176, 0, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(265, 0, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(355, 0, 89, 23);
		panel.add(button_2);
		
		JLabel lblPaco = new JLabel("Paco");
		lblPaco.setBounds(520, 4, 46, 14);
		panel.add(lblPaco);
		
		JButton btnDiseoGrafico = new JButton("Dise\u00F1o");
		btnDiseoGrafico.setBounds(0, 106, 89, 23);
		panel.add(btnDiseoGrafico);
		
		JButton btnCampo = new JButton("Hosteleria");
		btnCampo.setBounds(0, 77, 89, 23);
		panel.add(btnCampo);
		
		JList list = new JList();
		list.setBounds(0, 50, 116, 310);
		panel.add(list);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(88, 29, 499, 16);
		panel.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(138, 56, 439, 293);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(422, 0, 17, 318);
		panel_1.add(scrollBar_1);
		
		JLabel lblNombreCampo = new JLabel("Nombre campo");
		lblNombreCampo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNombreCampo.setBounds(129, 11, 139, 30);
		panel_1.add(lblNombreCampo);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(25, 49, 387, 2);
		panel_1.add(separator_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Conocimientos", "Numeros de ofertas"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(117);
		table.setBounds(26, 92, 370, 190);
		panel_1.add(table);
		
		JLabel lblConocimiento = new JLabel("Conocimiento");
		lblConocimiento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblConocimiento.setBounds(62, 77, 94, 14);
		panel_1.add(lblConocimiento);
		
		JLabel lblUmerosDeOfertas = new JLabel("Numeros de ofertas");
		lblUmerosDeOfertas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUmerosDeOfertas.setBounds(235, 78, 116, 14);
		panel_1.add(lblUmerosDeOfertas);
	}
}
