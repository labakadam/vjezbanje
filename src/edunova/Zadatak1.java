package edunova;

import javax.swing.JOptionPane;

public class Zadatak15 {

	//Za primljeni broj mjeseca ispisati njegov naziv
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i broj"));
		
		
		if(a==1) {
			System.out.println("Sije�anj");
		}if(a==2) {
			System.out.println("Velja�a");
		}if(a==3) {
			System.out.println("O�ujak");
		}if(a==4) {
			System.out.println("Travanj");
		}if(a==5) {
			System.out.println("Svibanj");
		}if(a==6) {
			System.out.println("Lipanj");
		}if(a==7) {
			System.out.println("Srpanj");
		}if(a==8) {
			System.out.println("Kolovoz");
		}if(a==9) {
			System.out.println("Rujan");
		}if(a==10) {
			System.out.println("Listopad");
		}if(a==11) {
			System.out.println("Studeni");
		}if(a==12) {
			System.out.println("Prosinac");
		}if(a<1 && a<12) {
			System.out.println("Nije mjesec");
		}
		
			
	}
}
