import javax.swing.JOptionPane;

//U�itati 4 cijela broja. Ako je bar jedan od njih pozitivan izra�unati im proizvod i Ispisati ga. 
//Ako je bar jedan od njih negativan izra�unati im zbir i Ispisati ga.	
public class vje�ba9 {
	public static void main(String[] args) {
		

		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugi broj"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Upi�i tre�i broj"));
		int d=Integer.parseInt(JOptionPane.showInputDialog("Upi�i �etvrti broj"));
		
		int z=a+b+c+d;
		int t=a*b*c*d;
		
		
		if(a>0 & b>0 & c>0 & d>0) {
			System.out.println(t);
		}else {
			System.out.println(z);
		}
		
		
	}

}
