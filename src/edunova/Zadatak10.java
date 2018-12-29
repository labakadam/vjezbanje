package edunova;
//Program uèitava 4 cijela broja i ispisuje ih od najmanjeg prema najveæem
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Zadatak10 {
	public static void main(String[] args) {
		int polje[]= {2, 1, 5, 8};
		int[] niz = {
			Integer.parseInt(JOptionPane.showInputDialog("Upiši 1.broj")),
			Integer.parseInt(JOptionPane.showInputDialog("Upiši 2.broj")),
			Integer.parseInt(JOptionPane.showInputDialog("Upiši 3.broj")),
			Integer.parseInt(JOptionPane.showInputDialog("Upiši 4.broj")),
		};
		Arrays.sort(niz);
		System.out.println(Arrays.toString(niz));
	}

}
