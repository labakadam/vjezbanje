package edunova;

import javax.swing.JOptionPane;

public class Zadatak12 {
	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Upiši broj sekundi"));
		
		int a=i/3600;
		int b=i/60;
		int c=i%60;
		int d=b%60;
		
		if(i>0 && i<60) {
			System.out.println(0+":"+0+":"+i);
		}else if(i>60 && i<3600) {
			System.out.println(0+":"+b+":"+c);
		}else if(b>59) {
			System.out.println(a+":"+d+":"+c);
		}
		
	
	}
}

