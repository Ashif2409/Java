class Student{
    public String name;
    public int age;
    public String subject;
    // Constructor
    public Student() {
        this.name = "";
        this.age = 0;
        this.subject = "";
    }
}
public class ArrayDemo {
    public static void main(String args[]){
        // int nums[]=new int[4];
        // nums[0]=10;
        // nums[1]=20;
        // nums[2]=30;
        // nums[3]=40;
        // int nums[] = {10, 20, 30, 40, 50}; // Initializing array with values
        // // nums[4]=50; // This will cause ArrayIndexOutOfBoundsException
        // for(int i=0;i<nums.length;i++){
        //     System.out.println("Element at index " + i + ": " + nums[i]);
        // }

        // Student students[] = new Student[3];
        // Student students[] = new Student[2]; // Array of Student objects
        // students[0] = new Student();
        // students[0].name = "Alice";
        // students[0].age = 20;
        // students[0].subject = "Math";
        // students[1] = new Student();
        // students[1].name = "Bob";
        // students[1].age = 22;
        // students[1].subject = "Science";
        // System.out.println("Student 1: " + students[0].name + ", Age: " + students[0].age + ", Subject: " + students[0].subject);
        // System.out.println("Student 2: " + students[1].name + ", Age: " + students[1].age + ", Subject: " + students[1].subject);
        //jagged array (where each row can have different number of columns)
        int d[][]={
            {1, 2, 3},
            {4, 5},
            {7, 8, 9}
        };
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
