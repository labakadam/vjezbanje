package edunova;

import javax.swing.JOptionPane;

//U programu omoguæite unos dvije stranice pravokutnika u centimetrima
//i omoguæite izraèun njegove površine i opsega
public class Zadatak7 {
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvu stranicu pravokutnika"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugu stranicu pravokutnika"));
		
		System.out.print(a*b);
		System.out.println(" cm je površina pravokutnika!");
		System.out.print((a*2)+(b*2));
		System.out.println(" cm je opseg pravokutnika!");
	}

}
