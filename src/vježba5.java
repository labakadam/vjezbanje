import javax.swing.JOptionPane;

//	U�itati 2 cijela broja i izra�unati im zbir, razliku, proizvod i koli�nik. 
//Ispisati ih na ekran ako su sva 4 rezultata pozitivna.
public class vje�ba5 { 
	public static void main(String[] args) {
		

		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugi broj"));
		
		int z=a+b,
			k=a-b,
			d=a*b,
			e=a/b;
		
		if(z>-1 && k>-1 && d>-1 && e>-1) {
			System.out.println(z + " " + k + " " + d + " " + e);
		}else {
			System.err.println("Ne ispisujem ni�ta ako je jedan od rezultata manji od nule!");
		}
		
	}

}
