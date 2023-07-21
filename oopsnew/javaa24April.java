package oopsnew;
class Member{
    String Name;
    int Age;
    String number;
    String Address;
    int Salary;
    public void printSalary(){
        System.out.println(Salary);
    }
}
class Employee extends Member{
    String spealization;
}
class Manager extends Member{
    String Department;
}
public class javaa24April {
    public static void main(String[] args) {
Employee m = new Employee();
m.Name = "naveen";
m.Age = 21;
m.Address = "coimbatore";
m.Salary = 10000;
m.number = "8977654570";
m.spealization = "Coding";
        System.out.println(m.Name);
       // System.out.println("\n");
        System.out.println(m.Salary);
        System.out.println(m.Address);
        System.out.println(m.Age);
        System.out.println(m.number);
        System.out.println(m.spealization);
        Manager mn = new Manager();
        mn.Department = "Accounts";
        System.out.println(mn.Department);
    }
}