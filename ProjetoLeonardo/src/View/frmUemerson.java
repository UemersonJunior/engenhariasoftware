package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

public class frmUemerson extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmUemerson frame = new frmUemerson();
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
	public frmUemerson() {
		setTitle("Uemerson");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTrcio = new JButton("T\u00E9rcio1");
		btnTrcio.setBounds(10, 254, 89, 23);
		contentPane.add(btnTrcio);
		
		JButton btnTrcio_1 = new JButton("T\u00E9rcio2");
		btnTrcio_1.setBounds(165, 254, 89, 23);
		contentPane.add(btnTrcio_1);
		
		JLabel lblGustavo = new JLabel("Gustavo1");
		lblGustavo.setBounds(30, 22, 46, 14);
		contentPane.add(lblGustavo);
		
		JLabel lblGustavo_1 = new JLabel("Gustavo2");
		lblGustavo_1.setBounds(30, 57, 46, 14);
		contentPane.add(lblGustavo_1);
		
		textField = new JTextField();
		textField.setBounds(86, 19, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 54, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Taynan");
		lblNewLabel.setBounds(30, 89, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Taynan");
		lblNewLabel_1.setBounds(30, 126, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 86, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(86, 123, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
