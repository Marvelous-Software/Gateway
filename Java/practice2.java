/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Practice 2
	9/4/2020 
*/

import java.util.Scanner;
import javax.swing.JOptionPane;


class Main
{
	public static void main(String[] args) {
		
		System.out.print("Enter something ->");
		Scanner in = new Scanner(System.in);
		String jibber = in.nextLine();
		in.close();
		System.out.print("/nOK " + jibber);
		
		String jabber = JOptionPane.showInputDialog(null, "Enter something else");
		JOptionPane.showMessageDialog(null, jabber);
		
       double answer = 2.20 - 2.00;
       boolean isEqual = answer == 0.20;
       System.out.println("answer is " + answer);
       System.out.println("isEqual is " + isEqual);
       System.out.println("answer; " + String.valueOf(answer) + " = 2.0 is " + String.valueOf(answer == 0.20));
  		
	}
}

