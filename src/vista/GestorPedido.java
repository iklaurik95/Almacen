package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.PedidoControlador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestorPedido extends JDialog {
	
	private PedidoControlador pedidoControlador;
	
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public GestorPedido(Principal principal, boolean modal) {
		super(principal,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnConsultarPedido = new JButton("Consultar Pedido");
			btnConsultarPedido.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pedidoControlador.abrirListadoPedido();
				}
			});
			btnConsultarPedido.setBounds(152, 96, 140, 23);
			contentPanel.add(btnConsultarPedido);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public PedidoControlador getPedidoControlador() {
		return pedidoControlador;
	}

	public void setPedidoControlador(PedidoControlador pedidoControlador) {
		this.pedidoControlador = pedidoControlador;
	}
	
}
