package refxy;
import java.util.*;
public class b3 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);       
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int a2 = sc.nextInt();
	        int b2 = sc.nextInt();
	         int z1 = a + a2;
	        int z2 = b+ b2;
	        System.out.println(z1+ "+" + z2 + "i");
	         int x = a - a2;
	        int x2= b - b2;
	        System.out.println( x+ "+" + x2 + "i");
	         int y = (a * a2) - (b * b2);
	        int y2= (a * b2) + (b * a2);
	        System.out.println( y + "+" + y2 + "i");
	    }
	}

