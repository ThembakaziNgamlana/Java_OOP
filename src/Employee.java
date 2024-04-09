public class Employee {
      int empNo;

     String name;

     String surname;

     double salary;

    Employee(int empNumber, String firstName, String lastName,double salary){
    this.empNo = empNumber;
    this.name = firstName;
    this.surname = lastName;
    this.salary = salary;
    }

    Employee(){}

    public void setEmpNo(int empNo){
        this.empNo = empNo;
    }

    public int getEmpNo(){
        return empNo;
    }


    public void setName(String Name){
        this.name = name;
    }


    public String getName(){
        return name;
    }


}
