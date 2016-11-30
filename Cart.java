package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
	List<String> carti = new ArrayList<>();
	
	
	public void addBook(String s){
		carti.add(s);
	}
	
	public void printReceipt(){
		try {	
			PrintWriter output = new PrintWriter("receipt.txt");
			for(int i = 0; i < carti.size(); i++){
				output.println(carti.get(i));
			}
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("dat file gone bruh");
			e.printStackTrace();
		}
		
		
	}
	
}

