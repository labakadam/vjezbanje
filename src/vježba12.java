import javax.swing.JOptionPane;

//U�itati 2 razlicita cijela broja. Ako su oba parna podijeliti ve�i sa manjim brojem. 
//Ako su oba neparna od ve�eg oduzeti manji broj. Ina�e zbrojiti ta dva broja.
public class vje�ba12 {
	public static void main(String[] args) {
		
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugi broj"));
		int r=a/b;
		int z=b/a;
		
		if(a==b) {
			System.out.println(a/b);
		}if(a%2==0 && b%2==0 && a>b) {
			System.out.println(r);
		}if(a%2==0 && b%2==0 && b>a) {
			System.out.println(z);
		}if(a%2!=0 && b%2!=0 && a>b) {
			System.out.println(a-b);
		}if(a%2!=0 && b%2!=0 && a<b) {
			System.out.println(b-a);
		}else {
			System.out.println(a+b);
		}
		

	}

}
