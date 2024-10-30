

public class ParttimeEMployee extends Employee {
    private int hourlyWorked;
    private double hourlyRate;

    public ParttimeEMployee(String name,int id,int hourlyWorked,double hourlyRate){
          super(name, id);
          this.hourlyWorked=hourlyWorked;
          this.hourlyRate=hourlyRate;
    }

    @Override
    public double CalculateSalary() {
        return hourlyWorked*hourlyRate;
    }
}

