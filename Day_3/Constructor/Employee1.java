public class Employee {
    private int emp_id;
    private String emp_name;
    private float emp_sal;

     public Employee(int id ,String ename)
     {
         System.out.println("In parametarized constructor");
         emp_id=id;
         emp_name=ename;
     }

    public static void main(String[] args)
    {
        Employee e=new Employee(101,"Arun");
    }
}
