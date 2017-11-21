package produto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class CadastrarProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeProduto;
	private JTextField textFieldCodigoDebarra;
	private JTextField textFieldValorCusto;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarProduto frame = new CadastrarProduto();
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
	public CadastrarProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 186);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Cadastro de Produto");
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome :");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(10, 10, 50, 14);
		contentPane.add(lblNome);

		textFieldNomeProduto = new JTextField();
		textFieldNomeProduto.setBounds(70, 8, 321, 20);
		contentPane.add(textFieldNomeProduto);
		textFieldNomeProduto.setColumns(10);

		JLabel lblCodigoDeBarra = new JLabel("Codigo de barra :");
		lblCodigoDeBarra.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCodigoDeBarra.setBounds(10, 45, 114, 14);
		contentPane.add(lblCodigoDeBarra);

		textFieldCodigoDebarra = new JTextField();
		textFieldCodigoDebarra.setBounds(130, 42, 261, 20);
		contentPane.add(textFieldCodigoDebarra);
		textFieldCodigoDebarra.setColumns(10);

		JLabel lblValorCustoUnitario = new JLabel("Valor Custo Unitario :");
		lblValorCustoUnitario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValorCustoUnitario.setBounds(10, 80, 129, 14);
		contentPane.add(lblValorCustoUnitario);

		textFieldValorCusto = new JTextField();
		textFieldValorCusto.setBounds(140, 78, 65, 20);
		contentPane.add(textFieldValorCusto);
		textFieldValorCusto.setColumns(10);

		JLabel lblQuantidade = new JLabel("Quantidade :");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQuantidade.setBounds(246, 80, 80, 14);
		contentPane.add(lblQuantidade);

		textField = new JTextField();
		textField.setBounds(336, 78, 55, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblValorDeVenda = new JLabel("Valor de Venda Unitario :");
		lblValorDeVenda.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValorDeVenda.setBounds(10, 110, 156, 14);
		contentPane.add(lblValorDeVenda);

		textField_1 = new JTextField();
		textField_1.setBounds(167, 107, 65, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setBounds(242, 107, 149, 23);
		contentPane.add(btnCadastrar);
	}
}
