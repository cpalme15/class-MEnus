package classwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyMenuFrame extends JFrame {
 private JMenuItem exitItem=null;
 private JMenuItem [] color_Items=null;
 private JMenuItem [] font_Items=null;
 private String[] fontNames={"Times New Roman","Sans Serif","Impact","Arial"};
 private String[] color_names={"Black","Blue","Green","Red","Dark Gray","Pink","Light Gray","Orange","Cyan","White","Magenta"};
 private Color[] colors={Color.black,Color.blue,Color.red,Color.green,Color.DARK_GRAY,Color.PINK,Color.lightGray,Color.ORANGE,Color.CYAN,Color.WHITE,Color.MAGENTA};
 private JMenu fileMenu=null;
 private JMenu  formatMenu=null;
 private JMenu colorMenu=null;
 private JMenu FontMenu=null;
 private JMenuBar bar=null;
 private JLabel displayLabel=null;
	
	public MyMenuFrame()
	{
		super("Menus");
		formatMenu=new JMenu("Format");
		colorMenu=new JMenu("Color");
		font_Items =new JMenuItem[fontNames.length];
		FontMenu=new JMenu("Fonts");
		color_Items =new JMenuItem[color_names.length];
		for(int i=0;i<color_names.length;i++){
		color_Items[i]=new JMenuItem(color_names[i]);
		color_Items[i].addActionListener(new colorHandler());
		colorMenu.add(color_Items[i]);
		}
		for(int i=0;i<fontNames.length;i++){
			font_Items[i]=new JMenuItem(fontNames[i]);
			font_Items[i].addActionListener(new fontHandler());
			FontMenu.add(font_Items[i]);
			}
		exitItem=new JMenuItem("Exit");
		fileMenu=new JMenu("File");
		bar= new JMenuBar();
		displayLabel=new JLabel("Lorum Ipsum",SwingConstants.CENTER);
		displayLabel.setFont(new Font("Times new Roman",Font.BOLD,72));
		displayLabel.setForeground(Color.green);
		fileMenu.add(exitItem);
		bar.add(fileMenu);
		this.setJMenuBar(bar);
		this.add(displayLabel,BorderLayout.CENTER);
		exitItem.addActionListener(new exitHandler());
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.META_MASK));
		formatMenu.add(colorMenu);
		formatMenu.add(FontMenu);
		bar.add(formatMenu);
		
		
		
		
		
		
	}

	

private class exitHandler implements ActionListener
{

public void actionPerformed(ActionEvent e) 
	{
	System.exit(0);
	}
	
	}
private class colorHandler implements ActionListener
{

public void actionPerformed(ActionEvent e) 
	{

	for(int i=0;i<color_names.length;i++)
	{	
		if(e.getActionCommand().equals(color_names[i]))
		{
	  displayLabel.setForeground(colors[i]);
	  }
	}
	}
	
	}
private class fontHandler implements ActionListener
{

public void actionPerformed(ActionEvent e) 
	{

	for(int i=0;i<fontNames.length;i++)
	{	
		if(e.getActionCommand().equals(fontNames[i]))
		{
	  displayLabel.setFont(new Font(fontNames[i],Font.ITALIC,40));
	  }
	}
	}
	
	}
}
