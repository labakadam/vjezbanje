package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {
	//Zadatak je da korisnik odgovori na nekoliko jednostavnih pitanja
	//zadatak je napravljen za zabavu i vje�banje
	
	public static void main(String[] args) {
		
		System.out.println(JOptionPane.showInputDialog("Upi�i ime grada gdje �ivi�").equals("Osijek") ? "Najbolji grad za �ivot." : "U krivom mjestu �ivi�.");
		System.out.println(JOptionPane.showInputDialog("Upi�i zanimanje").equals("Programer") ? "Super zanimanje ima�." : "I da zna� to ti je krivi smjer u �ivotu.");
		int i=Integer.parseInt(JOptionPane.showInputDialog("Upi�i broj godina"));
		System.out.println(i<40 ? "Sa godinama nije stra�no." : "Oh, ostario si �ovje�e!");
		System.out.println(JOptionPane.showInputDialog("Voli� li u�iti (Da-Ne)").equals("Da") ? "Jako dobar odgovor!" : "Hm, nije ba� dobar odgovor!");
		System.out.println(JOptionPane.showInputDialog("Ima� li nekakav hobi? (Da-Ne)").equals("Da") ? "Dobro je imati hobi!" : "Najbolje bi bilo da je odgovor Da!");

	}

}
