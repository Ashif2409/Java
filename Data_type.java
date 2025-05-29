public class Data_type {
    public static void main(String args[]){
        long LongValue=50000000000l; //8bytes
        float FloatValue=5.5f; //4bytes
        double DoubleValue=5.5; //8bytes
        int IntValue=1000; //4bytes
        short ShortValue=100; //2bytes
        byte ByteValue=10; //1byte
        char CharValue='A'; // 2bytes
        CharValue=66; // ASCII value for 'B' if we print CharValue it will print 'B'
        boolean BooleanValue=true; // 1bit, true or false

        double d1=5; //putting an int into a double (implicit conversion)
        int i1=(int)5.5; //putting a double into an int (explicit conversion/Type Casting)
        System.out.println("Long Value: " + LongValue);
        System.out.println("Float Value: " + FloatValue);
        System.out.println("Double Value: " + DoubleValue);
        System.out.println("Int Value: " + IntValue);
        System.out.println("Short Value: " + ShortValue);
        System.out.println("Byte Value: " + ByteValue);
        System.out.println("Char Value: " + CharValue);
        System.out.println("Boolean Value: " + BooleanValue);
        System.out.println("Double from int: " + d1);
        System.out.println("Int from double: " + i1);
    }
    
}
