package refxy;
public class test1 {
	
	    static void pattern(int n)
	    {
	        int p, k = 1;
	        for (int i = 1; i <= n; i++) {
	            p = k;
	            for (int j = 1; j <= i; j++) {
	                System.out.print(p);
	                System.out.print(" ");
	                p = p-(n+j-1);
	            }
	            System.out.println();
	            k = k + 1 + n - i;
	        }
	    }
	    public static void main(String[] args)
	    {
	        int n = 5;
	        
	        pattern(n);
	    }
	}


