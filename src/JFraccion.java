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
public class JFraccion extends JFrame 
{
	JPanel panel;
	JLabel label, label2, label3, label1;
	JTextField campoN1,campoD1,campoN2,campoD2;
	JButton botonMas,botonMenos,botonMulti,botonDiv;
	JScrollPane scroll;
	JTextArea area;
	int num,den,num1,num2,den1,den2,entero;
	
	public JFraccion()
	{
		setTitle("Operador de Fracciones");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		
		panel=new JPanel();
		panel.setLayout(null);
		setContentPane(panel);
		
		label=new JLabel("Escribe dos Fracciones Para realizar la Operacion");
		label.setBounds(100,20,310,30);
		panel.add(label);
		
		area=new JTextArea();
		area.setSize(270, 150);
		area.setEditable(false);
		
		scroll=new JScrollPane();
		scroll.setBounds(20, 150, 450, 300);
		try{
            scroll.setViewportView(area);
        }
        catch(Exception e){}
		panel.add(scroll);
		
		//Font font=new Font() ;
		campoN1=new JTextField();
		campoN1.setBounds(175,60,50,20);
		//campoN1.setFont(font);
		panel.add(campoN1);
		
		label1=new JLabel("_______");
		label1.setBounds(175,63,50,30);
		panel.add(label1);
		
		campoD1=new JTextField();
		campoD1.setBounds(175,90,50,20);
		panel.add(campoD1);
		
		label2=new JLabel("Y");
		label2.setBounds(245,70,20,30);
		panel.add(label2);
		
		campoN2=new JTextField();
		campoN2.setBounds(275,60,50,20);
		panel.add(campoN2);
		
		label3=new JLabel("_______");
		label3.setBounds(275,63,290,30);
		panel.add(label3);
		
		campoD2=new JTextField();
		campoD2.setBounds(275,90,50,20);
		panel.add(campoD2);
		
		botonMas=new JButton("Suma");
		botonMas.setBounds(7, 118, 115, 20);
		botonMas.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				area.setText("");
				try
				{
					num1=Integer.parseInt(campoN1.getText());
					num2=Integer.parseInt(campoN2.getText());
					den1=Integer.parseInt(campoD1.getText());
					den2=Integer.parseInt(campoD2.getText());
					
					if(den1!=den2)
					{
						num=(num1*den2)+(den1*num2);
						den=den1*den2;
						
						area.setText(area.getText()+"\nLa suma de la Fraccion es: \n "+num+"\n--------\n "+den);
						
						entero=0;
						
						if(num!=0&&den!=0)
						{
							while(num%2==0&&den%2==0)
							{
								num=num/2;
								den=den/2;
							}
							while(num%3==0&&den%3==0)
							{
								num=num/3;
								den=den/3;
							}
							while(num%5==0&&den%5==0)
							{
								num=num/5;
								den=den/5;
							}
							while(num%7==0&&den%7==0)
							{
								num=num/7;
								den=den/7;
							}
							
							area.setText(area.getText()+"\nLa suma simplificada de la Fraccion es: \n "+num+"\n--------\n "+den);
						}
						if(num>den)
						{
							entero=num/den;
							num=num%den;
							area.setText(area.getText()+"\nLa fraccion es impropia y su forma mixta es: \n         "+num+"\n"+entero+"  --------\n         "+den);
						}
					}
					else
					{	
						num=num1+num2;
						den=den1;
						
						area.setText(area.getText()+"\nLa suma de la Fraccion es: \n "+num+"\n--------\n "+den);

						entero=0;
						if(num!=0&&den!=0)
						{
							while(num%2==0&&den%2==0)
							{
								num=num/2;
								den=den/2;
							}
							while(num%3==0&&den%3==0)
							{
								num=num/3;
								den=den/3;
							}
							while(num%5==0&&den%5==0)
							{
								num=num/5;
								den=den/5;
							}
							while(num%7==0&&den%7==0)
							{
								num=num/7;
								den=den/7;
							}
							area.setText(area.getText()+"\nLa suma simplificada de la Fraccion es: \n "+num+"\n--------\n "+den);
						}
						if(num>den)
						{
							entero=num/den;
							num=num%den;
							area.setText(area.getText()+"\nLa fraccion es impropia, y su forma mixta es: \n         "+num+"\n"+entero+"  --------\n         "+den);
						}
					}
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
		panel.add(botonMas);
		
		botonMenos=new JButton("Resta");
		botonMenos.setBounds(127, 118, 115, 20);
		botonMenos.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				area.setText("");
				try
				{
					num1=Integer.parseInt(campoN1.getText());
					num2=Integer.parseInt(campoN2.getText());
					den1=Integer.parseInt(campoD1.getText());
					den2=Integer.parseInt(campoD2.getText());
					
					if(den1!=den2)
					{
						num=(num1*den2)-(den1*num2);
						den=den1*den2;
						
						area.setText(area.getText()+"\nLa resta de la Fraccion es: \n "+num+"\n--------\n "+den);
						
						entero=0;
						if(num!=0&&den!=0)
						{
							while(num%2==0&&den%2==0)
							{
								num=num/2;
								den=den/2;
							}
							while(num%3==0&&den%3==0)
							{
								num=num/3;
								den=den/3;
							}
							while(num%5==0&&den%5==0)
							{
								num=num/5;
								den=den/5;
							}
							while(num%7==0&&den%7==0)
							{
								num=num/7;
								den=den/7;
							}
							area.setText(area.getText()+"\nLa resta simplificada de la Fraccion es: \n "+num+"\n--------\n "+den);
						}
						if(num>den)
						{
							entero=num/den;
							num=num%den;
							area.setText(area.getText()+"\nLa fraccion es impropia, y su forma mixta es: \n         "+num+"\n"+entero+"  --------\n         "+den);
						}
					}
					else
					{	
						num=num1-num2;
						den=den1; 
						
						area.setText(area.getText()+"\nLa resta de la Fraccion es: \n "+num+"\n--------\n "+den);
						
						entero=0;
						if(num!=0&&den!=0)
						{
							while(num%2==0&&den%2==0)
							{
								num=num/2;
								den=den/2;
							}
							while(num%3==0&&den%3==0)
							{
								num=num/3;
								den=den/3;
							}
							while(num%5==0&&den%5==0)
							{
								num=num/5;
								den=den/5;
							}
							while(num%7==0&&den%7==0)
							{
								num=num/7;
								den=den/7;
							}
							area.setText(area.getText()+"\nLa resta simplificada de la Fraccion es: \n "+num+"\n--------\n "+den);
						}
						if(num>den)
						{
							entero=num/den;
							num=num%den;
							area.setText(area.getText()+"\nLa fraccion es impropia, y su forma mixta es: \n         "+num+"\n"+entero+"  --------\n         "+den);
						}
					}
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
		panel.add(botonMenos);
		
		botonMulti=new JButton("Multiplicacion");
		botonMulti.setBounds(247, 118, 115, 20);
		botonMulti.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				area.setText("");
				try
				{
					num1=Integer.parseInt(campoN1.getText());
					num2=Integer.parseInt(campoN2.getText());
					den1=Integer.parseInt(campoD1.getText());
					den2=Integer.parseInt(campoD2.getText());
					
					num=num1*num2;
					den=den1*den2;
					
					area.setText(area.getText()+"\nLa multiplicacion de la Fraccion es: \n "+num+"\n--------\n "+den);

					entero=0;
					if(num!=0&&den!=0)
					{
						while(num%2==0&&den%2==0)
						{
							num=num/2;
							den=den/2;
						}
						while(num%3==0&&den%3==0)
						{
							num=num/3;
							den=den/3;
						}
						while(num%5==0&&den%5==0)
						{
							num=num/5;
							den=den/5;
						}
						while(num%7==0&&den%7==0)
						{
							num=num/7;
							den=den/7;
						}
						area.setText(area.getText()+"\nLa Multiplicacion simplificada de la Fraccion es: \n "+num+"\n--------\n "+den);
					}
					if(num>den)
					{
						entero=num/den;
						num=num%den;
						area.setText(area.getText()+"\nLa fraccion es impropia, y su forma mixta es: \n         "+num+"\n"+entero+"  --------\n         "+den);
					}
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
		panel.add(botonMulti);
		
		botonDiv=new JButton("Divicion");
		botonDiv.setBounds(367, 118, 115, 20);
		botonDiv.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				area.setText("");
				try
				{
					num1=Integer.parseInt(campoN1.getText());
					num2=Integer.parseInt(campoN2.getText());
					den1=Integer.parseInt(campoD1.getText());
					den2=Integer.parseInt(campoD2.getText());
				
					num=num1*den2;
					den=den1*num2;
					
					area.setText(area.getText()+"\nLa division de la Fraccion es: \n "+num+"\n--------\n "+den);

					entero=0;
					if(num!=0&&den!=0)
					{
						while(num%2==0&&den%2==0)
						{
							num=num/2;
							den=den/2;
						}
						while(num%3==0&&den%3==0)
						{
							num=num/3;
							den=den/3;
						}
						while(num%5==0&&den%5==0)
						{
							num=num/5;
							den=den/5;
						}
						while(num%7==0&&den%7==0)
						{
							num=num/7;
							den=den/7;
						}
						area.setText(area.getText()+"\nLa division simplificada de la Fraccion es: \n "+num+"\n--------\n "+den);
					}
					if(num>den)
					{
						entero=num/den;
						num=num%den;
						area.setText(area.getText()+"\nLa fraccion es impropia, y su forma mixta es: \n         "+num+"\n"+entero+"  --------\n         "+den);
					}
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}

			}
		});
		panel.add(botonDiv);
		
		setVisible(true);
	}
}
