package T5interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class raton extends JFrame {
	private JPanel contentPane;
	private JComboBox combo1;
	private JSpinner spinner1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					raton frame = new raton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public raton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Velocidad del ratón");
		label1.setBounds(35, 6, 130, 16);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Botón seleccionado");
		label2.setBounds(221, 6, 152, 16);
		contentPane.add(label2);
		
		combo1 = new JComboBox();
		combo1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				repaint();
			}
		});
		combo1.setModel(new DefaultComboBoxModel(new String[] {"Izquierdo", "Derecho"}));
		combo1.setBounds(208, 34, 142, 27);
		contentPane.add(combo1);
		
		spinner1 = new JSpinner();
		spinner1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				repaint();
			}
		});
		spinner1.setModel(new SpinnerNumberModel(0,0,100,25));
		spinner1.setBounds(45, 36, 109, 26);
		contentPane.add(spinner1);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.DARK_GRAY);
		g.drawRect(215,120,120,150);
		g.drawRect(50,120, 100, 20);
		if(combo1.getSelectedItem().toString().equals("Izquierdo")) {
			g.fillRect(215,120, 60, 60);
			g.setColor(Color.blue);
			g.fillOval(215,120,60,60);
		}
		else {
			g.fillRect(275,120, 60, 60);
			g.setColor(Color.red);
			g.fillOval(275,120,60,60);
		}
		if(spinner1.getValue().equals(0)) {
			g.setColor(Color.black);
			g.fillRect(50,120, 0, 20);
		}
		else if(spinner1.getValue().equals(25)){
			g.setColor(Color.red);
			g.fillRect(50,120, 25, 20);
		}
		else if(spinner1.getValue().equals(50)){
			g.setColor(Color.orange);
			g.fillRect(50,120, 50, 20);
		}else if(spinner1.getValue().equals(75)){
			g.setColor(Color.yellow);
			g.fillRect(50,120, 75, 20);
		}else if(spinner1.getValue().equals(100)){
			g.setColor(Color.green);
			g.fillRect(50,120, 100, 20);
		}
	}
}
