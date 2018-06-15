package hemant;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.IOException;

public class fileOperations {
	
	private Formatter x;
	public void openFile(){
		try{
			x = new Formatter("fileoper.txt");
		}
		catch(Exception e){
			System.out.println("You have an error");
		}
	}
	
	public void addRecords(){
		x.format("%s%s%s","20 ", "Hemant ","Gogawale ");
	}
	
	public void closeFile(){
		x.close();
	}
}
