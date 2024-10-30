import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
     private List<Employee> employeelist;
     public PayrollSystem(){
           employeelist=new ArrayList<>();
     }
     public void addEmployee(Employee employee){
             employeelist.add(employee);
     }

     public void removeEmployee(int id){
        Employee employeeToRemove=null;
        for(Employee employee:employeelist){
             if(employee.getId()==id){
                  employeeToRemove=employee;
                  break;
             }
        }
        if(employeeToRemove != null){
             employeelist.remove(employeeToRemove);
        }
     }

     public void displayEmployee(){
        for(Employee employee:employeelist){
            System.out.println(employee);
        }
     }

}
