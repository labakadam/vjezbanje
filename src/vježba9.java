import javax.swing.JOptionPane;

//Uèitati 4 cijela broja. Ako je bar jedan od njih pozitivan izraèunati im proizvod i Ispisati ga. 
//Ako je bar jedan od njih negativan izraèunati im zbir i Ispisati ga.	
public class vježba9 {
	public static void main(String[] args) {
		

		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Upiši treæi broj"));
		int d=Integer.parseInt(JOptionPane.showInputDialog("Upiši èetvrti broj"));
		
		int z=a+b+c+d;
		int t=a*b*c*d;
		
		
		if(a>0 & b>0 & c>0 & d>0) {
			System.out.println(t);
		}else {
			System.out.println(z);
		}
		
		
	}

}
