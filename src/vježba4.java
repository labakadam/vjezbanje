import javax.swing.JOptionPane;

//U�itati 2 cijela broja i izra�unati im zbir, razliku, proizvod i koli�nik. 
//Ispisati najve�i od 4 dobijena rezultata bez ponavljanja.
public class vje�ba4 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugi broj"));
		
		int z=a+b,
			k=a-b,
			d=a*b,
			e=a/b;
		
		if(z>d) {
			System.out.println(z);
		}if(d>z) {
			System.out.println(d);
		}
		
	}

}
