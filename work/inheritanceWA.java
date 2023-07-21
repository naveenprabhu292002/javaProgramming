package work;

import java.util.*;
class inheritanceWA{
    public static void main(String args[])
    {
        sqrt obj =new sqrt();
        rect my=new rect();
        obj.display1();
        my.display();
        obj.show();
    }
}
class sqrt extends circle
{
    Scanner sc=new Scanner(System.in);
    void display1()
    {
        int l,area;
        l=sc.nextInt();
        area=l*l;
        System.out.println(area);
    }
}
class rect extends circle
{
    Scanner my=new Scanner(System.in);
    void display()
    {
        int l1,b1,area1;
        l1=my.nextInt();
        b1=my.nextInt();
        area1=l1*b1;
        System.out.println(area1);
    }
}
class circle
{
    Scanner sc2=new Scanner(System.in);
    void show()
    {
        float r,p=3.14f,Area2;
        r=sc2.nextInt();
        Area2=p*r*r;
        System.out.print(Area2);
    }
}