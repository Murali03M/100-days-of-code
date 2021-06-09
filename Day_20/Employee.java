public class Employee {
    protected int employee_id;
    protected String employee_name;
    public static void main(String args[])
    {
        Employee obj=new Employee(101,"murali");
        System.out.println(obj);

    }
    public String toString()
    {
        return "ID "+employee_id+"NAME "+employee_name;
    }
   public Employee(int employee_id,String employee_name)
   {
       this.employee_id=employee_id;
       this.employee_name=employee_name;
   }


}