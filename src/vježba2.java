import javax.swing.JOptionPane;

//	Uèitati 2 cijela broja i izraèunati im zbir, razliku, proizvod i koliènik. Ispisati one rezultate koji su trocifreni.
public class vježba2 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		
		int z=a+b,
			k=a-b,
			d=a*b,
			e=a/b;
		
		if(z>99 && z<1000) {
			System.out.println("Zbir brojeva je " + z + "!");
		}if(k>99 && k<1000) {
			System.out.println("Razlika brojeva je " + k + "!");
		}if(d>99 && d<1000) {
			System.out.println("Proizvod brojeva je " + d + "!");
		}if(e>99 && e<1000) {
			System.out.println("Koliènik brojeva je " + e + "!");
		}else {
			System.out.println("Rezultat nije trocifreni broj!");
		}
	}

}
