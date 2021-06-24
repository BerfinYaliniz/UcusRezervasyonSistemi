
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Yonetici extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yonetici frame = new Yonetici();
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
	public Yonetici() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Y\u00D6NET\u0130C\u0130");
		label.setBounds(5, 5, 424, 33);
		label.setAlignment(Label.CENTER);
		label.setBackground(Color.GRAY);
		label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		label.setForeground(Color.WHITE);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("PEGASUS");
		btnNewButton.setBounds(10, 68, 231, 56);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pegasus_sefer pg=new Pegasus_sefer();
				
				pg.setVisible(true);
				
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setForeground(Color.RED);
		contentPane.add(btnNewButton);
		
		JButton btnAnadolujet = new JButton("ANADOLU.JET");
		btnAnadolujet.setBounds(10, 138, 231, 56);
		btnAnadolujet.setBackground(Color.WHITE);
		btnAnadolujet.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAnadolujet.setForeground(Color.BLUE);
		contentPane.add(btnAnadolujet);
		
		JButton btnAtlas = new JButton("ATLAS");
		btnAtlas.setBounds(10, 205, 231, 56);
		btnAtlas.setBackground(Color.WHITE);
		btnAtlas.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAtlas.setForeground(Color.GREEN);
		contentPane.add(btnAtlas);
	}

}
