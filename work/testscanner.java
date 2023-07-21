package work;
import java.util.*;


public class testscanner

{

public static void Pattern()

{

int i,j;

int k;

int n=4;

for(i=1; i<=n; i++)

{

k=i;

for(j=1; j<=i; j++)

{

System.out.print(k+" ");

k=k+n+j;

}

System.out.println();

}

}

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();

testscanner t=new testscanner();

t.Pattern();

}

}

