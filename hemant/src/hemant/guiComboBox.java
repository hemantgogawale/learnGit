package hemant;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class guiComboBox extends JFrame{
	private JComboBox box;
	private JLabel picture;
	
	private static String[] fileName = {"b.JPG","x.JPG"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(fileName[0])), new ImageIcon(getClass().getResource(fileName[1]))};
	
	public guiComboBox(){
		super("Title");
		setLayout(new FlowLayout());
		
		box = new JComboBox(fileName);
		
		box.addItemListener(
			new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent event) {
					// TODO Auto-generated method stub
					if(event.getStateChange()==ItemEvent.SELECTED)
						picture.setIcon(pics[box.getSelectedIndex()]);
					
				}
			}
		
		);
		
		add(box);
		picture=new JLabel(pics[0]);
		add(picture);
		
	}

}
