import javax.swing.JOptionPane;

//U�itati 2 cijela broja i izra�unati im zbir, razliku, proizvod i koli�nik. 
//Ispisati najmanji od 4 dobijena rezultata bez ponavljanja.	
public class vje�ba3 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugi broj"));
		
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
