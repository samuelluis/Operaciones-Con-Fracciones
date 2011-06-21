import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class JPorciento extends JFrame 
{
	JPanel panel;
	JLabel label,label2,label1;
	JTextField campoN1,campoD1,campoInt;
	JButton botonRes;
	JScrollPane scroll;
	JTextArea area;
	double num,num1,den1,entero;
	
	public JPorciento()
	{
		setTitle("Resolucion de Porsentajes");
		setSize(500,250);
		setLocationRelativeTo(null);
		setResizable(false);
		
		panel=new JPanel();
		panel.setLayout(null);
		setContentPane(panel);
		
		label=new JLabel("Escribe la Fraccion y el Numero Entero a Resolver");
		label.setBounds(100,20,310,30);
		panel.add(label);
		
		area=new JTextArea();
		area.setSize(270, 50);
		area.setEditable(false);
		
		scroll=new JScrollPane();
		scroll.setBounds(20, 150, 450, 50);
		try{
            scroll.setViewportView(area);
        }
        catch(Exception e){}
		panel.add(scroll);
		
		campoN1=new JTextField();
		campoN1.setBounds(175,60,50,20);
		panel.add(campoN1);
		
		label1=new JLabel("_______");
		label1.setBounds(175,63,50,30);
		panel.add(label1);
		
		campoD1=new JTextField();
		campoD1.setBounds(175,90,50,20);
		panel.add(campoD1);
		
		label2=new JLabel("De");
		label2.setBounds(243,70,20,30);
		panel.add(label2);
		
		campoInt=new JTextField();
		campoInt.setBounds(275,75,50,20);
		panel.add(campoInt);
		
		botonRes=new JButton("Resolver");
		botonRes.setBounds(190, 118, 115, 20);
		botonRes.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				area.setText("");
				try
				{
					num1=Double.parseDouble(campoN1.getText());
					entero=Double.parseDouble(campoInt.getText());
					den1=Double.parseDouble(campoD1.getText());
					
					num=num1*entero/den1;
					
					area.setText(area.getText()+"\nLa Resolucion es: "+num);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,
                            "Digite Solo Numeros Enteros",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel.add(botonRes);

		setVisible(true);
	}
}
