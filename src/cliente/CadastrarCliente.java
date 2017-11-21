package cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastrarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField lblEndereco;
	private JTextField txtNum;
	private JTextField txtBairro;
	private JTextField txtPonto;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCliente frame = new CadastrarCliente();
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
	public CadastrarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 280);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarCliente = new JLabel("Cadastrar Cliente");
		lblCadastrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCadastrarCliente.setBounds(139, 11, 119, 14);
		contentPane.add(lblCadastrarCliente);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(10, 36, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 52, 379, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEndereo.setBounds(10, 81, 64, 14);
		contentPane.add(lblEndereo);
		
		lblEndereco = new JTextField();
		lblEndereco.setBounds(10, 99, 298, 20);
		contentPane.add(lblEndereco);
		lblEndereco.setColumns(10);
		
		JLabel lblN = new JLabel("N\u00BA:");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblN.setBounds(318, 81, 37, 14);
		contentPane.add(lblN);
		
		txtNum = new JTextField();
		txtNum.setBounds(318, 99, 68, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBairro.setBounds(10, 130, 46, 14);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(10, 146, 154, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblPontoDeReferncia = new JLabel("Ponto de Refer\u00EAncia:");
		lblPontoDeReferncia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPontoDeReferncia.setBounds(174, 130, 132, 14);
		contentPane.add(lblPontoDeReferncia);
		
		txtPonto = new JTextField();
		txtPonto.setBounds(174, 146, 215, 20);
		contentPane.add(txtPonto);
		txtPonto.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefone.setBounds(10, 177, 64, 14);
		contentPane.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(10, 193, 106, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrar.setBounds(267, 215, 119, 23);
		contentPane.add(btnCadastrar);
	}
}
