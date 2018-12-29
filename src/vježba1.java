import javax.swing.JOptionPane;
//	Uèitati 2 cijela broja i izraèunati im zbir, razliku, proizvod i koliènik.
public class vježba1 {
	public static void main(String[] args) {
		
		
	int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši jedan broj"));
	int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
	
	int z=a+b,
		k=a-b,
		d=a*b,
		e=a/b;
	if(a>b) {
	System.out.println("Zbir prvog i drugog broja je " + z + "!" + " Razlika prvog i drugog broja je " + k + "!" + 
	" Proizvod prvog i drugog broja je " + d +"!" + " Koliènik prvog i drugog broja je " + e +"!");}
	if(a<b && k<0) {
			System.out.println("Zbir prvog i drugog broja je " + z + "!" + " Razlika prvog i drugog broja je manja od 0 i iznosi " + k + "!" + 
	" Proizvod prvog i drugog broja je " + d +"!" + " Koliènik prvog i drugog broja ne ispisujem jer je prvi broj manji od drugog!");
		}
	}
	
		
	}

