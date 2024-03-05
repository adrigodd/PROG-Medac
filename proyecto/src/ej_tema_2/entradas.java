package ej_tema_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class entradas extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			entradas dialog = new entradas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public entradas() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(5, 3, 0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton = new JButton("");
				btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(btnNewButton.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton.setBackground(new Color(255, 255, 255));
						}
					}
				});
				btnNewButton.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_1 = new JButton("");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(btnNewButton_1.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton_1.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton_1.setBackground(new Color(255, 255, 255));
						}
						
					}
				});
				btnNewButton_1.setBackground(new Color(255, 255, 255));
				btnNewButton_1.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_1);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_2 = new JButton("");
				btnNewButton_2.setBackground(new Color(255, 0, 0));
				btnNewButton_2.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_2);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_3 = new JButton("");
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(btnNewButton_3.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton_3.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton_3.setBackground(new Color(255, 255, 255));
						}
					}
				});
				btnNewButton_3.setBackground(new Color(255, 255, 255));
				btnNewButton_3.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_3);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_4 = new JButton("");
				btnNewButton_4.setBackground(new Color(255, 0, 0));
				btnNewButton_4.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_4);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_5 = new JButton("");
				btnNewButton_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(btnNewButton_5.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton_5.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton_5.setBackground(new Color(255, 255, 255));
						}
					}
				});
				btnNewButton_5.setBackground(new Color(255, 255, 255));
				btnNewButton_5.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_5);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_6 = new JButton("");
				btnNewButton_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(btnNewButton_6.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton_6.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton_6.setBackground(new Color(255, 255, 255));
						}
					}
				});
				btnNewButton_6.setBackground(new Color(255, 255, 255));
				btnNewButton_6.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_6);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_7 = new JButton("");
				btnNewButton_7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(btnNewButton_7.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton_7.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton_7.setBackground(new Color(255, 255, 255));
						}
					}
				});
				btnNewButton_7.setBackground(new Color(255, 255, 255));
				btnNewButton_7.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_7);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_8 = new JButton("");
				btnNewButton_8.setBackground(new Color(255, 0, 0));
				btnNewButton_8.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_8);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_9 = new JButton("");
				btnNewButton_9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(btnNewButton_9.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton_9.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton_9.setBackground(new Color(255, 255, 255));
						}
					}
				});
				btnNewButton_9.setBackground(new Color(255, 255, 255));
				btnNewButton_9.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_9);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_10 = new JButton("");
				btnNewButton_10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(btnNewButton_10.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton_10.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton_10.setBackground(new Color(255, 255, 255));
						}
					}
				});
				btnNewButton_10.setBackground(new Color(255, 255, 255));
				btnNewButton_10.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_10);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_11 = new JButton("");
				btnNewButton_11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(btnNewButton_11.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton_11.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton_11.setBackground(new Color(255, 255, 255));
						}
					}
				});
				btnNewButton_11.setBackground(new Color(255, 255, 255));
				btnNewButton_11.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_11);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_12 = new JButton("");
				btnNewButton_12.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(btnNewButton_12.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton_12.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton_12.setBackground(new Color(255, 255, 255));
						}
					}
				});
				btnNewButton_12.setBackground(new Color(255, 255, 255));
				btnNewButton_12.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_12);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_13 = new JButton("");
				btnNewButton_13.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(btnNewButton_13.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton_13.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton_13.setBackground(new Color(255, 255, 255));
						}
					}
				});
				btnNewButton_13.setBackground(new Color(255, 255, 255));
				btnNewButton_13.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_13);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JButton btnNewButton_14 = new JButton("");
				btnNewButton_14.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						if(btnNewButton_14.getBackground().equals(new Color(255, 255, 255))) {
							btnNewButton_14.setBackground(new Color(0, 255, 0));
						}else {
							btnNewButton_14.setBackground(new Color(255, 255, 255));
						}
					}
				});
				btnNewButton_14.setBackground(new Color(255, 255, 255));
				btnNewButton_14.setIcon(new ImageIcon(entradas.class.getResource("/Imagen/85671 (1).png")));
				panel.add(btnNewButton_14);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("COMPRAR");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						compra dialog = new compra();
						dialog.setVisible(true);
						setVisible(false);
					
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("CANCELAR");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						venta_entradas frame = new venta_entradas();
						frame.setVisible(true);
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
