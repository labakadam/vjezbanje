import javax.swing.JOptionPane;

//Uèitati 2 realna broja razlièita od 0. 
//Ako su razlièitog predznaka sabrati ih, a ako su istog predznaka pomnožiti ih. 
//Rezulat Ispisati na ekran.	
public class vježba8 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		
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
