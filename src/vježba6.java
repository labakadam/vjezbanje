import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

//U�itati 3 pozitivna razli�ita realna broja.
//Izra�unati razliku najve�eg i najmanjeg, pa tu razliku podijeliti sa srednjim od ta 3 broja. 
//Kona�ni rezultat Ispisati na ekran.
public class vje�ba6 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugi broj"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Upi�i tre�i broj"));
		
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
			System.err.println("Sva tri broja se moraju upisati razli�ita!");
		}
			
		
		
		
	}

}
