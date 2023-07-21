package oopsnew;
import java.util.*;
public class oopsnewasses{
    public int lengthOfLastWord(final String a){
	  int len = 0;
	  
     
      String x = a.trim();

      for (int i = 0; i < x.length(); i++) {
          if (x.charAt(i) == ' ')
              len = 0;
          else
              len++;
      }

      return len;
  }

  
  public static void main(String[] args)
  {
      //String input = "Hello World";
	  Scanner obj=new Scanner(System.in);
	  String s = obj.nextLine();
      oopsnewasses gfg = new oopsnewasses();
      System.out.println("output:"+ gfg.lengthOfLastWord(s));
  }
}

