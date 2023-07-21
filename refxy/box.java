package refxy;
import java.util.*;
class box1 
{
double width;
double height;
double depth;
}


class box{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		box1 mybox=new box1();
		double vol;
		double width=sc.nextDouble();
		double height=sc.nextDouble();
		
		double depth=sc.nextDouble();
		vol= width*height*depth;
		System.out.println("volume is"+vol);
		
	}



	
}


//class box1 
//{
//double width;
//double height;
//double depth;
//}