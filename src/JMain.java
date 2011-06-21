import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JMain extends JFrame 
{
	JPanel panel;
	JButton boton1,boton2;
	public JMain()
	{
		super("Fracciones");
		setSize(250,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		panel=new JPanel();
		panel.setLayout(null);
		setContentPane(panel);
		
		boton1=new JButton("Operaciones con Fracciones");
		boton1.setBounds(20, 10, 200, 20);
		boton1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				new JFraccion();
			}
		});
		panel.add(boton1);
		
		boton2=new JButton("Resolucion de Porcentajes");
		boton2.setBounds(20, 35, 200, 20);
		boton2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				new JPorciento();
			}
		});
		panel.add(boton2);
		
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new JMain();
	}
}
