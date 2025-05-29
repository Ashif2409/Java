class A{
    public A(){
        System.out.println("Constructor of class A");
    }
    public A(int i){
        System.out.println("Constructor of class A with parameter: " + i);
    }
}

class B extends A{
    public B(){
        System.out.println("Constructor of class B");
    }
    public B(int i){
        super(i); //defaul is super() which will call the default constructor of class A
        System.out.println("Constructor of class B with parameter: "+ i);
    }

}

public class Super {
    public static void main(String[] args) {
       B b=new B();// call default of both
       B a = new B(5); // to call parameterize constructor we assign i value to super

    }
}
