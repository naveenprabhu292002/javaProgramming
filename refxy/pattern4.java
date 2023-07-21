package refxy;
import java.util.*;
public class pattern4 {
	
		 public static void main(String[] args) {
				Scanner in = new Scanner(System.in);

				int x=in.nextInt();
				int y=in.nextInt();


				  for (int i = x; i > 0; i--) 
				{ 
				    for (int j = y; j > i; j--) 
				        System.out.print(j); 
				 
				    for (int j = i; j > 0; j--) 
				        System.out.print(i); 
				  //  System.out.print(i +" "); 
				 
				    System.out.println(); 
				} 
					}

				
			

		}
	    