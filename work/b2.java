package work;
import java.util.*;
public class b2 {
	public static void main(String[] args) {
	
		Scanner obj=new Scanner(System.in);
		//System.out.print("Enter a string: ");
        String str = obj.nextLine();
        String[] a = str.split(" ");
        String smallestWord = a[0];
        String largestWord = a[0];
        for (int i = 0; i < a.length; i++)
		{
            if (a[i].length() < smallestWord.length())
			{
                smallestWord = a[i];
            }
            if (a[i].length() > largestWord.length())
			{
                largestWord = a[i];
            }
        }
        System.out.println( smallestWord);
        System.out.println( largestWord);

	}
	

}