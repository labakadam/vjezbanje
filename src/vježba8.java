import javax.swing.JOptionPane;

//U�itati 2 realna broja razli�ita od 0. 
//Ako su razli�itog predznaka sabrati ih, a ako su istog predznaka pomno�iti ih. 
//Rezulat Ispisati na ekran.	
public class vje�ba8 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugi broj"));
		
		int c=a+b;
		int d=a*b;
		
		if(a!=0 && b!=0 && a==b && a<0 && a>0) {
			System.out.println(d);
		}if(a!=0 && b!=0 &&  a<0 && b<0) {
			System.out.println(d);
		}if(a!=0 && b!=0 &&  a>0 && b>0) {
			System.out.println(d);
		}if(a!=0 && b!=0 && a<0 && b>0) {
			System.out.println(c);
		}if(a!=0 && b!=0 && a>0 && b<0) {
			System.out.println(c);
		}
		
	}

}
