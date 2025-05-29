class CalcAdd{
    public int add(int ...a) {
        int sum=0;
        for(int num:a){
            sum += num;
        }
        return sum;
    }
}
class CalcSub extends CalcAdd {
    public int sub(int a, int b) {
        return a - b;
    }
}
class CalcMul extends CalcSub {
    public int mul(int ...numbers) {
        int a = 1; // Start with 1 for multiplication
        for (int number : numbers) {
            a *= number;
        }
        return a ;
    }
}
class CalcDiv extends CalcMul {
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
public class Inheritance{
    public static void main(String args[]) {
       CalcDiv calc = new CalcDiv();
         System.out.println("Addition: " + calc.add(1, 2, 3, 4, 5));
        System.out.println("Subtraction: " + calc.sub(10, 5));
        System.out.println("Multiplication: " + calc.mul(2, 3, 4));
        System.out.println("Division: " + calc.div(20, 5));
        try {
            System.out.println("Division: " + calc.div(20, 0)); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}