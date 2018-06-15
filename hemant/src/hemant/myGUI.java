package hemant;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class myGUI extends JFrame{
	private JTextField folderLocation;
	private JTextField oldValue;
	private JTextField newValue;
	private JButton ok;
	private JButton cancel;
	private JLabel folderLable;
	private JLabel oldLable;
	private JLabel newLable;
	
	public myGUI(){
		super("Update Test Data");
		
		setLayout(new FlowLayout());
		
		folderLable = new JLabel("Folder name:");
		add(folderLable);
		
		folderLocation = new JTextField(30);
		add(folderLocation);
		
		oldLable = new JLabel("Old Test value:");
		add(oldLable);
		
		oldValue = new JTextField(10);
		add(oldValue);
		
		newLable = new JLabel("New Test value:");
		add(newLable);
		
		newValue = new JTextField(10);
		add(newValue);
		
		ok = new JButton("OK");
		add(ok);
		
		cancel = new JButton("Cancel");
		add(cancel);
		
		theHandler handler = new theHandler();
		folderLocation.addActionListener(handler);
		oldValue.addActionListener(handler);
		newValue.addActionListener(handler);
		ok.addActionListener(handler);
		cancel.addActionListener(handler);
		
	}
	
	private class theHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String folder, oValue, nValue;
			
			folder = String.format("Enter folder path %s", event.getActionCommand());
			oValue = String.format("Test Data %s", event.getActionCommand());
			nValue = String.format("Test Data %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, folder);
			JOptionPane.showMessageDialog(null, oValue);
			JOptionPane.showMessageDialog(null, nValue);
		}
	}

}
