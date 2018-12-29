import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

//Uèitati 3 pozitivna razlièita realna broja.
//Izraèunati razliku najveæeg i najmanjeg, pa tu razliku podijeliti sa srednjim od ta 3 broja. 
//Konaèni rezultat Ispisati na ekran.
public class vježba6 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Upiši treæi broj"));
		
		int r=c-a;
		int p=b-a;
		int t=c-b;
		int u=a-b;
		int h=a-c;
		int g=b-c;
		
		if(a<b && a<c && b<c) {
			System.out.println(r / b);
		}if(a<b && a<c && c<b) {
			System.out.println(p / c);
		}if(b<a && b<c && a<c) {
			System.out.println(t / a);
		}if(b<a && b<c && c<a) {
			System.out.println(u / c);
		}if(c<a && c<b && b<a) {
			System.out.println(h / b);
		}if(c<a && c<b && a<b) {
			System.out.println(g / a);
		}else {
			System.err.println("Sva tri broja se moraju upisati razlièita!");
		}
			
		
		
		
	}

}
