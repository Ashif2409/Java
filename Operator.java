

// Arithmetic Operators in Java: +, -, *, /, %
// Bitwise Operators in Java: &, |, ^, ~, <<, >>, >>>
// Relational Operators in Java: ==, !=, >, <, >=, <=
// Logical Operators in Java: &&, ||, !
public class Operator {
    public  static void main(String args[]){
        int n=5,m=6;
        int sum=n+m; // Addition
        int diff=n-m; // Subtraction
        int prod=n*m; // Multiplication
        double div=(double)n/m; // Division (explicit conversion to double)
        int mod=n%m; // Modulus
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
    }
    
}
