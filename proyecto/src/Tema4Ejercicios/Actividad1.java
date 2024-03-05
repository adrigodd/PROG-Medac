package Tema4Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Actividad1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String[] formas = {"Triángulo", "Círculo", "Cuadrado"};
    private JComboBox<String> comboBox;
    private JPanel panelDibujo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad1 frame = new Actividad1();
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
	public Actividad1() {
		JFrame frame = new JFrame("Formas Geométricas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Crear el ComboBox
        comboBox = new JComboBox<>(formas);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dibujarForma((String) comboBox.getSelectedItem());
            }
        });

        // Crear el panel de dibujo
        panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // El dibujo se realiza aquí
            }
        };
        panelDibujo.setPreferredSize(new Dimension(400, 400));

        // Agregar componentes al marco
        frame.add(comboBox, BorderLayout.NORTH);
        frame.add(panelDibujo, BorderLayout.CENTER);

        // Configurar el marco
        frame.pack();
        frame.setVisible(true);
    }

    private void dibujarForma(String forma) {
        Graphics g = panelDibujo.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, panelDibujo.getWidth(), panelDibujo.getHeight());
        g.setColor(Color.BLACK);

        if (forma.equals("Triángulo")) {
            int[] xPoints = {200, 100, 300};
            int[] yPoints = {100, 300, 300};
            g.drawPolygon(xPoints, yPoints, 3);
        } else if (forma.equals("Círculo")) {
            g.drawOval(150, 150, 100, 100);
        } else if (forma.equals("Cuadrado")) {
            g.drawRect(150, 150, 100, 100);
        }
    }

   

}


