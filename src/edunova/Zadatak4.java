package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {
	//Zadatak je da korisnik odgovori na nekoliko jednostavnih pitanja
	//zadatak je napravljen za zabavu i vježbanje
	
	public static void main(String[] args) {
		
		System.out.println(JOptionPane.showInputDialog("Upiši ime grada gdje živiš").equals("Osijek") ? "Najbolji grad za život." : "U krivom mjestu živiš.");
		System.out.println(JOptionPane.showInputDialog("Upiši zanimanje").equals("Programer") ? "Super zanimanje imaš." : "I da znaš to ti je krivi smjer u životu.");
		int i=Integer.parseInt(JOptionPane.showInputDialog("Upiši broj godina"));
		System.out.println(i<40 ? "Sa godinama nije strašno." : "Oh, ostario si èovjeèe!");
		System.out.println(JOptionPane.showInputDialog("Voliš li uèiti (Da-Ne)").equals("Da") ? "Jako dobar odgovor!" : "Hm, nije baš dobar odgovor!");
		System.out.println(JOptionPane.showInputDialog("Imaš li nekakav hobi? (Da-Ne)").equals("Da") ? "Dobro je imati hobi!" : "Najbolje bi bilo da je odgovor Da!");

	}

}
