package edunova;
//Program u�itava 4 cijela broja i ispisuje ih od najmanjeg prema najve�em
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Zadatak10 {
	public static void main(String[] args) {
		int polje[]= {2, 1, 5, 8};
		int[] niz = {
			Integer.parseInt(JOptionPane.showInputDialog("Upi�i 1.broj")),
			Integer.parseInt(JOptionPane.showInputDialog("Upi�i 2.broj")),
			Integer.parseInt(JOptionPane.showInputDialog("Upi�i 3.broj")),
			Integer.parseInt(JOptionPane.showInputDialog("Upi�i 4.broj")),
		};
		Arrays.sort(niz);
		System.out.println(Arrays.toString(niz));
	}

}
