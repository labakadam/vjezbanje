package edunova;

import javax.swing.JOptionPane;

//U programu omogu�ite unos dvije stranice pravokutnika u centimetrima
//i omogu�ite izra�un njegove povr�ine i opsega
public class Zadatak7 {
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvu stranicu pravokutnika"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugu stranicu pravokutnika"));
		
		System.out.print(a*b);
		System.out.println(" cm je povr�ina pravokutnika!");
		System.out.print((a*2)+(b*2));
		System.out.println(" cm je opseg pravokutnika!");
	}

}
