package oopsnew;
class student4
{
	int id;
	String name;
	
	student4(int i,String n) 
	{
		id=i;
		name=n;	
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
}
	

public class parametarizedConstructor
{
	public static void main(String []args) 
	{
		student4 s1=new student4 (33,"SabareeSDR");
		student4 s2=new student4(22,"Naveenrefexy");
		student4 s3=new student4(11,"SalmanKadhar");
		s1.display();
		s2.display();
		s3.display();			
		
		
			
}				
}


