 import java.util.*;
public class Q1 {
    //q1 level1
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the age:");
        age=sc.nextInt();
        if(age>=18){
            System.out.println(String.format("The person's age is %d and can vote",age));
            return;
        }
        System.out.println(String.format("The person's age is %d and cannot vote",age));
        sc.close();
    }
    
}