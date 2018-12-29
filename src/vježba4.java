import javax.swing.JOptionPane;

//Uèitati 2 cijela broja i izraèunati im zbir, razliku, proizvod i koliènik. 
//Ispisati najveæi od 4 dobijena rezultata bez ponavljanja.
public class vježba4 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		
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
