import javax.swing.JOptionPane;

//U�itati koordinate 3 to�ke u ravnini: x1,y1; x2, y2; x3,y3. Te 3 to�ke predstavljaju tjemena trokuta u ravnini.
//Izra�unati i ispisati opseg.	
public class vje�ba11 {
	public static void main(String[] args) {
		

		int x1=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvu kordinatu x"));
		int y1=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvu kordinatu y"));
		int x2=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugu kordinatu x"));
		int y2=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugu kordinatu y"));
		int x3=Integer.parseInt(JOptionPane.showInputDialog("Upi�i tre�u kordinatu x"));
		int y3=Integer.parseInt(JOptionPane.showInputDialog("Upi�i tre�u kordinatu y"));
		
		int a=(x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1);
		int b=(x3-x2)*(x3-x2)+ (y3-y2)*(y3-y2);
		int c=(x3-x1)*(x3-x1)+ (y3-y1)*(y3-y1);
		int opseg=a+b+c;
		
		System.out.println(opseg);
	}

}
