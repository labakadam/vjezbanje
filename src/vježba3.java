import javax.swing.JOptionPane;

//Uèitati 2 cijela broja i izraèunati im zbir, razliku, proizvod i koliènik. 
//Ispisati najmanji od 4 dobijena rezultata bez ponavljanja.	
public class vježba3 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		
		int z=a+b,
			k=a-b,
			d=a*b,
		    e=a/b;
		
		if(a==b && k<e) {
			System.err.println(k);
		}if(e<k) {
			System.out.println(e);
		}if(k<e && k<0) {
			System.out.println(k);
		};
       
    }
}
