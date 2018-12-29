import javax.swing.JOptionPane;

//Uèitati 2 razlicita cijela broja. Ako su oba parna podijeliti veæi sa manjim brojem. 
//Ako su oba neparna od veæeg oduzeti manji broj. Inaèe zbrojiti ta dva broja.
public class vježba12 {
	public static void main(String[] args) {
		
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
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
