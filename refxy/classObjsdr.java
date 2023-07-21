package refxy;
class me{
	String name;
	int age;
	String dept;
	
	
}

public class classObjsdr {
 public static void main(String [] args) {
	 
	 me nav=new me();
	 nav.name="naveen";
	 nav.age= 21;
	 nav.dept="cse";
	 String details;
	 details= "my name is " +  nav.name + ","+ " age is "+  nav.age +","+" and dept is "+nav.dept;
	 System.out.println(details);
 }
}
