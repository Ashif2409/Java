public class Condition {
    public static void main(String args[]) {
        int a = 10, b = 20;

        // If-Else Condition
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // Ternary Operator
        String result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println(result);

        // Switch Case
        int day = 3; //we can use string also in switch case after Java 7
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }

}
