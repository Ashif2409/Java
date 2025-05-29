class Outer {
    private String message = "Hello from the Outer class!";

    // class Inner {
    //     void display() {
    //         // System.out.println("Inner class accessing: " + message);
    //         message = "Hello from the Inner class!";
    //         System.out.println(message);
    //     }
    // }
    static class Inner {
        private String message = "Hello from the Inner class!";

        void display() {
            System.out.println("Inner class accessing: " + this.message);
        }
    }

    void display() {
        System.out.println(message);
    }
}

public class InnerClass {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.display();
        // Outer.Inner inner = outer.new Inner();
        Outer.Inner inner = new Outer.Inner(); // Using static inner class
        inner.display();
    }
}
