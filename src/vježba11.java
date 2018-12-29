import javax.swing.JOptionPane;

//Uèitati koordinate 3 toèke u ravnini: x1,y1; x2, y2; x3,y3. Te 3 toèke predstavljaju tjemena trokuta u ravnini.
//Izraèunati i ispisati opseg.	
public class vježba11 {
	public static void main(String[] args) {
		

		int x1=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvu kordinatu x"));
		int y1=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvu kordinatu y"));
		int x2=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugu kordinatu x"));
		int y2=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugu kordinatu y"));
		int x3=Integer.parseInt(JOptionPane.showInputDialog("Upiši treæu kordinatu x"));
		int y3=Integer.parseInt(JOptionPane.showInputDialog("Upiši treæu kordinatu y"));
		
		int a=(x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1);
		int b=(x3-x2)*(x3-x2)+ (y3-y2)*(y3-y2);
		int c=(x3-x1)*(x3-x1)+ (y3-y1)*(y3-y1);
		int opseg=a+b+c;
		
		System.out.println(opseg);
	}

}
