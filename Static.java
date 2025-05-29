class Employee{
    int eId;
    String eName;
    static String ceo;

    // Static block to initialize static variable called only once when the class is loaded
    static {
        ceo = "Default CEO"; // Initializing static variable
    }
  

    Employee(int id, String name){
        this.eId = id;
        this.eName = name;
    }
}

public class Static {
    public static void main(String[] args) {
        Employee E1=new Employee(1, "Alice");
        E1.eName= "Alice Smith";
        // E1.ceo="Alice";
        Employee E2=new Employee(2, "Bob");
        E2.eName= "Bob Johnson";
        // E2.ceo="Bob"; // if we changed the static variable ceo for E2, it will change for all instances of Employee
        Employee.ceo = "Charlie"; // Static variable can be accessed using class name
        
        System.out.println("Employee 1: " + E1.eId + ", " + E1.eName + ", CEO: " + Employee.ceo);
        System.out.println("Employee 1: " + E1.eId + ", " + E1.eName + ", CEO: " + Employee.ceo);
        //we can only access static variable in static methods or static blocks
    }
}
