import javax.swing.JOptionPane;
//	U�itati 2 cijela broja i izra�unati im zbir, razliku, proizvod i koli�nik.
public class vje�ba1 {
	public static void main(String[] args) {
		
		
	int a=Integer.parseInt(JOptionPane.showInputDialog("Upi�i jedan broj"));
	int b=Integer.parseInt(JOptionPane.showInputDialog("Upi�i drugi broj"));
	
	int z=a+b,
		k=a-b,
		d=a*b,
		e=a/b;
	if(a>b) {
	System.out.println("Zbir prvog i drugog broja je " + z + "!" + " Razlika prvog i drugog broja je " + k + "!" + 
	" Proizvod prvog i drugog broja je " + d +"!" + " Koli�nik prvog i drugog broja je " + e +"!");}
	if(a<b && k<0) {
			System.out.println("Zbir prvog i drugog broja je " + z + "!" + " Razlika prvog i drugog broja je manja od 0 i iznosi " + k + "!" + 
	" Proizvod prvog i drugog broja je " + d +"!" + " Koli�nik prvog i drugog broja ne ispisujem jer je prvi broj manji od drugog!");
		}
	}
	
		
	}

