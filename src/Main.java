import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       PayrollSystem psm=new PayrollSystem();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the employee name");
       String FllTimeEmpName=sc.nextLine();
       System.out.println("Enter the employee ID");
       int FullTimeEmpID=sc.nextInt();
       System.out.println("Enter the employee MonthlySalary");
       int FullTimeEmpSalary=sc.nextInt();
       fullTimeEmployee emp1=new fullTimeEmployee(FllTimeEmpName,FullTimeEmpID,FullTimeEmpSalary);
       System.out.println("Enter the Part employee name");
       String PartTimeEmpName=sc.next();
       System.out.println("Enter the part employee ID");
       int PartTimeEmpID=sc.nextInt();
       System.out.println("Enter the part employee HourlyWorked");
       int PartTimeEmpHourlyWorked=sc.nextInt();
       System.out.println("enter the part employee hourlyRate");
       double PartTimeEmpHourlyRate=sc.nextDouble();
       ParttimeEMployee emp2=new ParttimeEMployee(PartTimeEmpName,PartTimeEmpID,PartTimeEmpHourlyWorked,
                PartTimeEmpHourlyRate);

       psm.addEmployee(emp1);
       psm.addEmployee(emp2);

       System.out.println("Initial Employee");
       psm.displayEmployee();

        System.out.println("enter the Id to remove Employee");

        int i=sc.nextInt();
        psm.removeEmployee(i);

        System.out.println("Remaining Employee after Removing");
        psm.displayEmployee();

    }
}