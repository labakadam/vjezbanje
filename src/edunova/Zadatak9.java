package edunova;

import javax.swing.JOptionPane;

public class Zadatak9 {

	//Napi�i program u Javi koji pro�ita jedan broj preko tipkovnice. 
	//Nakon toga program odredi da li je upisani broj paran
	//ili neparan. Ako je paran neka program ispi�e taj broj uve�an za
	//10 puta. U slu�aju da je neparan neka program
	//ispi�e taj broj 5 puta jedan pored drugoga
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i neki broj"));
		
		if(a%2==0) {
			System.out.println(a*10);
		 }else if(a%2!=0) {
			 System.out.println(a+" "+a+" "+a+" "+a+" "+a);
		 }
		
		}

}
