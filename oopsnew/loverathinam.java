package oopsnew;
import java.util.*;

public class loverathinam {
	public static void main(String[] args) {
		System.out.println("I_rathinam");  
		      Scanner scan = new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();

		 System.out.print("1."+a+"\n"+"2."+b);
		        int c = scan.nextInt();
		String d=" ";
		        switch(c){  
		       case 1:
		 d=a;  
		    break;  
		    case 2:
		 d=b;
		    break;  
		         default:
		System.out.println("Invalid");  
		    }
		System.out.print("I "+d+" rathinam");  
		}  }