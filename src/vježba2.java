import javax.swing.JOptionPane;

//	U�itati 2 cijela broja i izra�unati im zbir, razliku, proizvod i koli�nik. Ispisati one rezultate koji su trocifreni.
public class vje�ba2 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugi broj"));
		
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
			System.out.println("Koli�nik brojeva je " + e + "!");
		}else {
			System.out.println("Rezultat nije trocifreni broj!");
		}
	}

}
