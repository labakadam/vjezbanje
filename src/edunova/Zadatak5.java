package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {
	public static void main(String[] args) {
		
	

	//Upiši dva cijela broja
	//ispiši
	//Zbroj
	//Razliku
	//Produkt
	//Kvocijent
	//Aritmetièku sredinu
	//zbroj kvadrata brojeva
	 int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši 1. broj"));
	 int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši 2. broj"));
	 
	 System.out.println(a+b);
	 System.out.println(a-b);
	 System.out.println(a*b);
	 System.out.println(a/b);
	 System.out.println((a+b)/2);
	 System.out.println((a*a)+(b*b));
	 
	
	}
}
