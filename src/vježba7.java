import javax.swing.JOptionPane;

//U�itati 3 razli�ita realna broja. Ispisati ih u rastu�em redoslijedu na ekran.
public class vje�ba7 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugi broj"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Upi�i tre�i broj"));
		
		
		if(a<b && b<c) {
			System.out.println(a + " " + b + " " + c);
		}if(a<b && c<b) {
		    System.out.println(a + " " + c + " " + b);	
		}if(b<a && a<c) {
			System.out.println(b + " " + a + " " + c);
		}if(b<c && c<a) {
			System.out.println(b + " " + c + " " + a);
		}if(c<a && a<b) {
		    System.out.println(c + " " + a + " " + b);	
		}if(c<b && b<a) {
			System.out.println(c + " " + b + " " + a);
		}else {
			System.err.println("Sva tri broja moraju biti razli�ita!");
		}
		
		
	}

}
