import javax.swing.JOptionPane;

//Uèitati 3 razlièita realna broja. Ispisati ih u rastuæem redoslijedu na ekran.
public class vježba7 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Upiši treæi broj"));
		
		
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
			System.err.println("Sva tri broja moraju biti razlièita!");
		}
		
		
	}

}
