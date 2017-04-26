package vista;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ClienteControlador;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GestorCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ClienteControlador clienteControlador;
	
	public GestorCliente(Principal principal,boolean modal) {
		super(principal,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clienteControlador.abrirFormularioCliente();
			}
		});
		btnClientes.setBounds(133, 86, 137, 23);
		contentPanel.add(btnClientes);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clienteControlador.abrirBorradoCliente();
			}
		});
		btnConsulta.setBounds(133, 146, 137, 23);
		contentPanel.add(btnConsulta);
		
		JLabel lblGestorCliente = new JLabel("Gestor Cliente");
		lblGestorCliente.setBounds(126, 30, 144, 20);
		contentPanel.add(lblGestorCliente);
		
		JButton btnListadoClientes = new JButton("Listado Clientes");
		btnListadoClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clienteControlador.abrirListadoCliente();
			}
		});
		btnListadoClientes.setBounds(133, 201, 137, 23);
		contentPanel.add(btnListadoClientes);
	}
	
	public ClienteControlador getClienteControlador() {
		return clienteControlador;
	}

	public void setClienteControlador(ClienteControlador clienteControlador) {
		this.clienteControlador = clienteControlador;
	}
}
