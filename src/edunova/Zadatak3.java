package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {
	public static void main(String[] args) {
		// Za dva unesena broja ispiši njihovu razliku u apsolutnoj vrijednosti
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		
		int r=a-b;
		int p=b-a;
		
	if(r<0) {
		System.out.println(p);
	}if(r>0) {
		System.out.println(r);
	}
	}
	}
