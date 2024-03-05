package T5interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfugue.player.Player;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TecladoPiano extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Player player;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TecladoPiano frame = new TecladoPiano();
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
	public TecladoPiano() {
		player=new Player();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton C = new JButton("DO");
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	          player.play("C");
			}
		});
		panel.add(C);
		
		JButton D = new JButton("RE");
		D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

               
				player.play("D");
			}
		});
		panel.add(D);
		
		
		JButton E = new JButton("MI");
		E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

              
				player.play("E");;
			}
		});
		panel.add(E);
		
		JButton F = new JButton("FA");
		F.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

            
				player.play("F");
			}
		});
		
		panel.add(F);
		
		JButton G = new JButton("SOL");
		G.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play("G");
			}
		});
		panel.add(G);
		
		JButton A = new JButton("LA");
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.play("A");
			}
		});
		panel.add(A);
		
		
		JButton B = new JButton("SI");
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 player.play("B");
			}
		});
		
		panel.add(B);
	}
		

}
