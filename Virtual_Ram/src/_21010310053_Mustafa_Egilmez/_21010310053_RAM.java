package _21010310053_Mustafa_Egilmez;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _21010310053_RAM {

	static String[] ram(int sayac1) throws FileNotFoundException {
		 
		 Scanner ramInput = new Scanner(new File("RAM.txt"));
		 
		  {
			 if(sayac1 == 0) {
				 
				 if(ramInput.hasNextLine()) {
					 System.out.println("RAM.txt Okundu");
				 }
				 else {
					 System.out.println("Dosya Bulunamadı");
				 }
				 
			 }			
		 } 
		 String[] RAM = new String[16];
		 int sayac = 0;
		 while(ramInput.hasNextLine() && sayac < RAM.length) {
			 RAM[sayac] = ramInput.nextLine();
			 sayac++;
		 }		 
	   return RAM;	 
	 }
}
