import javax.swing.JOptionPane;

//Uèitati 3 realna pozitivna broja i ispitati da li postoji trokut èije su to stranice.	
public class vježba10 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Upiši prvu stranicu trokuta"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Upiši drugu stranicu trokuta"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Upiši treæu stranicu trokuta"));
		
		
		if(a>0 && b>0 && c>0 && (a+b)>c && (a+c)>b && (b+c)>a) {
			System.out.println("Postoji trokut sa zadanim stranicama!");
		}else {
			System.err.println("Ne postoji trokut sa zadanim stranicama!");
		}
		
	
		
		
		
	}

}
