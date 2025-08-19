import java.util.*;
public class Conditionals{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // int age=sc.nextInt();

        int score=sc.nextInt();


        // if(age>=21) {
        //     System.out.print("You are adult..");
        // }else{
        //     System.out.print("You are child..");
        // }

        if(score>=90){
            System.out.print("Grade A");
        }else if(score>=80){
            System.out.print("Grade B");
        }else if(score>=70){
            System.out.print("Grade C");
        }else{
            System.out.print("Grade D");
        }
    }
}