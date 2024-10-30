
public class fullTimeEmployee extends Employee {
    private double MonthlySalary;

    public fullTimeEmployee(String name, int id, double MonthlySalary){
         super(name,id);
         this.MonthlySalary=MonthlySalary;

    }

    @Override
    public double CalculateSalary() {
        return MonthlySalary;
    }
}
