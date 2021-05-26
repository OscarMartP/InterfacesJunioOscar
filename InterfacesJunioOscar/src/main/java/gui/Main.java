package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Main extends JFrame {

	private JPanel jpanel;
	private JTextField txtMenu;

	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main(args);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main(final String[] args) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		jpanel = new JPanel();
		jpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jpanel);
		
		JButton nuevoUsuario = new JButton("Nuevo usuario");
		nuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				try {
					CrearUsuario.main(args);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JButton nuevoPedido = new JButton("Nuevo pedido");
		nuevoPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CrearPedido.main(args);
			}
		});
		
		txtMenu = new JTextField();
		txtMenu.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenu.setText("MENU");
		txtMenu.setColumns(10);
			
		GroupLayout panel = new GroupLayout(jpanel);
		panel.setHorizontalGroup(
			panel.createParallelGroup(Alignment.CENTER)
				.addGroup(Alignment.TRAILING, panel.createSequentialGroup()
					.addContainerGap(271, Short.MAX_VALUE)
					.addGroup(panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(panel.createSequentialGroup()
							.addComponent(nuevoUsuario)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(nuevoPedido))
						.addComponent(txtMenu, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
					.addGap(249))
		);
		panel.setVerticalGroup(
			panel.createParallelGroup(Alignment.CENTER)
				.addGroup(panel.createSequentialGroup()
					.addGap(117)
					.addComponent(txtMenu, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(80)
					.addGroup(panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(nuevoPedido)
						.addComponent(nuevoUsuario))
					.addContainerGap(278, Short.MAX_VALUE))
		);
		
		jpanel.setLayout(panel);
	}
}