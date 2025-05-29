
class Calc{
    public  int sum(int ...numbers) { // variable number of arguments {1,2,3,4,5}
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
public class VarArgs {
    public static void main(String[] args) {
       Calc calc= new Calc();
       System.out.println(calc.sum(1,2,3,4,5));

    }
}
