package venda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Venda extends JFrame {

	private JPanel contentPaneVenda;
	private JTextField textField;
	private DefaultListModel modeloProduto;
	private JTable tableVenda;
	private DefaultTableModel modelo;
	private int cont = 0;
	private JLabel lblCdigoDeBarras;
	private JLabel lblDescrio;
	private JTextField txtDescrição;
	private JLabel lblQuant;
	private JTextField txtQuant;
	private JLabel lblValorUn;
	private JTextField txtValor;
	private JLabel lblValorTotal;
	private JTextField txtValorTotal;
	private JLabel lblOperador;
	private JLabel lblOp;
	private JLabel lblHora;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		
			public void run() {
				
				try {
					Venda frame = new Venda();
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
	public Venda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 493);
		
		
		
		criaComponente();
		Acoes();

	}
	
	public void criaComponente(){
		contentPaneVenda = new JPanel();
		contentPaneVenda.setBackground(Color.WHITE);
		contentPaneVenda.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneVenda);
		contentPaneVenda.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField.setBounds(10, 107, 236, 20);
		contentPaneVenda.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(256, 81, 484, 362);
		contentPaneVenda.add(scrollPane);
		
		tableVenda = new JTable();
		scrollPane.setViewportView(tableVenda);
		tableVenda.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ITEM", "C\u00D3DIGO", "DESCRI\u00C7\u00C3O", "QTD", "VL. UN", "TOTAL"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, true, true, true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableVenda.getColumnModel().getColumn(0).setPreferredWidth(42);
		tableVenda.getColumnModel().getColumn(1).setPreferredWidth(83);
		tableVenda.getColumnModel().getColumn(2).setPreferredWidth(235);
		tableVenda.getColumnModel().getColumn(5).setResizable(false);
		tableVenda.getColumnModel().getColumn(5).setPreferredWidth(80);
		tableVenda.setColumnSelectionAllowed(true);
		tableVenda.setCellSelectionEnabled(true);
		
		lblCdigoDeBarras = new JLabel("C\u00F3digo de Barras");
		lblCdigoDeBarras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCdigoDeBarras.setBounds(10, 83, 140, 21);
		contentPaneVenda.add(lblCdigoDeBarras);
		
		lblDescrio = new JLabel("Descri\u00E7\u00E3o ");
		lblDescrio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescrio.setBounds(10, 11, 75, 20);
		contentPaneVenda.add(lblDescrio);
		
		txtDescrição = new JTextField();
		txtDescrição.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDescrição.setEditable(false);
		txtDescrição.setBackground(Color.WHITE);
		txtDescrição.setBounds(10, 34, 248, 30);
		contentPaneVenda.add(txtDescrição);
		txtDescrição.setColumns(10);
		//txtDescrição.setText("Laranja");
		
		lblQuant = new JLabel("Quant.");
		lblQuant.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuant.setBounds(10, 138, 46, 20);
		contentPaneVenda.add(lblQuant);
		
		txtQuant = new JTextField();
		txtQuant.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtQuant.setBounds(10, 159, 56, 20);
		contentPaneVenda.add(txtQuant);
		txtQuant.setColumns(10);
		
		lblValorUn = new JLabel("Valor Unit\u00E1rio");
		lblValorUn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorUn.setBounds(78, 138, 99, 20);
		contentPaneVenda.add(lblValorUn);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtValor.setBackground(Color.WHITE);
		txtValor.setEditable(false);
		txtValor.setBounds(76, 159, 101, 20);
		contentPaneVenda.add(txtValor);
		txtValor.setColumns(10);
		
		lblValorTotal = new JLabel("Valor Total");
		lblValorTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorTotal.setBounds(10, 198, 75, 20);
		contentPaneVenda.add(lblValorTotal);
		
		txtValorTotal = new JTextField();
		txtValorTotal.setBackground(Color.WHITE);
		txtValorTotal.setEditable(false);
		txtValorTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtValorTotal.setBounds(10, 221, 86, 20);
		contentPaneVenda.add(txtValorTotal);
		txtValorTotal.setColumns(10);
		
		lblOperador = new JLabel("Operador:");
		lblOperador.setBounds(311, 11, 68, 14);
		contentPaneVenda.add(lblOperador);
		
		lblOp = new JLabel("Gugu");
		lblOp.setBounds(374, 11, 140, 14);
		contentPaneVenda.add(lblOp);
		
		lblHora = new JLabel("");
		lblHora.setBounds(311, 34, 112, 14);
		contentPaneVenda.add(lblHora);
		
		lblData = new JLabel("");
		lblData.setBounds(311, 56, 112, 14);
		contentPaneVenda.add(lblData);
	}
	
	 public void dataEHora(){
	        Calendar cal = new GregorianCalendar();
	        int dia = cal.get(Calendar.DAY_OF_MONTH);
	        int mes = cal.get(Calendar.MONTH);
	        int ano = cal.get(Calendar.YEAR);
	        int hora = cal.get(Calendar.HOUR);
	        int minuto = cal.get(Calendar.MINUTE);
	        int segundo = cal.get(Calendar.SECOND);
	        lblData.setText("Data:" + dia + "/" + (mes + 1) + "/"+ano);
	        lblHora.setText("Hora:" + hora + ":" + minuto + ":" + segundo);
	 }
	
	public void Acoes(){
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(java.awt.event.KeyEvent evt) {
				if(evt.getKeyCode() == KeyEvent.VK_ENTER && !textField.getText().trim().equals("")){
					cont++;
					modelo = (DefaultTableModel) tableVenda.getModel();
					modelo.addRow(new Object[]{cont, "123456", "Água", txtQuant.getText()});
					textField.setText("");
				}
			}
		});
		
		
	}
}
