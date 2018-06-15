package hemant;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class guiList extends JFrame{
	private JList list;
	private static String[] colornames = {"black","blue","red","white"};
	private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
	
	public guiList(){
		super("Title");
		setLayout(new FlowLayout());
		
		list = new JList(colornames);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				new ListSelectionListener() {
					
					@Override
					public void valueChanged(ListSelectionEvent event) {
						// TODO Auto-generated method stub
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					}
				}
				
		);
		
	}

}
