package funcionario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastroFuncionario extends JFrame {

	private JPanel ctFunção;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtNum;
	private JTextField txtBairro;
	private JTextField txtCtps;
	private JTextField txtCnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
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
	public CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 298);
		ctFunção = new JPanel();
		ctFunção.setBackground(Color.WHITE);
		ctFunção.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ctFunção);
		ctFunção.setLayout(null);
		
		JLabel lblCadastrarFuncionrio = new JLabel("Cadastrar Funcion\u00E1rio");
		lblCadastrarFuncionrio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCadastrarFuncionrio.setBounds(95, 11, 150, 14);
		ctFunção.add(lblCadastrarFuncionrio);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(10, 39, 46, 14);
		ctFunção.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 57, 332, 20);
		ctFunção.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEndereo.setBounds(10, 88, 64, 14);
		ctFunção.add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(10, 106, 260, 20);
		ctFunção.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblN = new JLabel("N\u00BA:");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblN.setBounds(280, 88, 29, 14);
		ctFunção.add(lblN);
		
		txtNum = new JTextField();
		txtNum.setBounds(280, 106, 62, 20);
		ctFunção.add(txtNum);
		txtNum.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBairro.setBounds(10, 137, 46, 14);
		ctFunção.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(10, 154, 127, 20);
		ctFunção.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblCtps = new JLabel("CTPS:");
		lblCtps.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCtps.setBounds(10, 185, 46, 14);
		ctFunção.add(lblCtps);
		
		txtCtps = new JTextField();
		txtCtps.setBounds(10, 201, 107, 20);
		ctFunção.add(txtCtps);
		txtCtps.setColumns(10);
		
		JLabel lblCnh = new JLabel("CNH:");
		lblCnh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCnh.setBounds(128, 185, 46, 14);
		ctFunção.add(lblCnh);
		
		txtCnh = new JTextField();
		txtCnh.setBounds(128, 201, 117, 20);
		ctFunção.add(txtCnh);
		txtCnh.setColumns(10);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFuno.setBounds(147, 137, 46, 20);
		ctFunção.add(lblFuno);
		
		JComboBox cbFuncao = new JComboBox();
		cbFuncao.setBackground(new Color(255, 255, 255));
		cbFuncao.setBounds(147, 154, 195, 20);
		ctFunção.add(cbFuncao);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrar.setBounds(225, 230, 117, 23);
		ctFunção.add(btnCadastrar);
	}

}
