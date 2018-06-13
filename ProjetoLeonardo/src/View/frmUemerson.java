package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class frmUemerson extends JFrame {

	private JPanel contentPane;

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
	}
}
