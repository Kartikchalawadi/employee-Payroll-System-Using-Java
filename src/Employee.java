abstract class Employee {
      private String name;
      private  int id;

      Employee(String name, int  id){
          this.name=name;
          this.id=id;
      }

      public String getName(){
          return name;
      }

      public int getId(){
          return id;
      }

      public abstract double CalculateSalary();

      public  String toString(){
        return "Employee [name="+name+",id="+id+", salary="+CalculateSalary()+"]";
      }



}
