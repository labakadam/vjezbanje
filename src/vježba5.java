import javax.swing.JOptionPane;

//	Uèitati 2 cijela broja i izraèunati im zbir, razliku, proizvod i koliènik. 
//Ispisati ih na ekran ako su sva 4 rezultata pozitivna.
public class vježba5 { 
	public static void main(String[] args) {
		

		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		
		int z=a+b,
			k=a-b,
			d=a*b,
			e=a/b;
		
		if(z>-1 && k>-1 && d>-1 && e>-1) {
			System.out.println(z + " " + k + " " + d + " " + e);
		}else {
			System.err.println("Ne ispisujem ništa ako je jedan od rezultata manji od nule!");
		}
		
	}

}
