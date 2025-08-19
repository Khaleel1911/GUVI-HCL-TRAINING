import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      int n=sc.nextInt();
      int f1=0;
      int f2=1;
      System.out.print(f1+" "+f2+" ");
      for(int i=2;i<n;i++){
        int f3=f1+f2;
        f1=f2;
        f2=f3;
      System.out.print(f3+" ");
      }
      
      
  }
}