import java.util.*;
public class ArrayDemo{
    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        
    // String []names={"Khaleel","Pavan","Akhil Varma","Nagesh","Parshu Aramulu"};

    //     for(String name:names){
    //         System.out.println(name);
    //     }


    //     int[] marks=new int[5];
    //     marks[0]=85;
    //     marks[1]=55;
    //     marks[2]=75;
    //     marks[3]=65;
    //     marks[4]=95;

        // int sum=0;

        // int target=75;
        // for(int i=0;i<5;i++){
        //     if(marks[i]==target){
        //         System.out.println(i);
        //         break;
        //     }
        // }



        // for(int mark:marks){
        //     mark+=2;
        //    System.out.println(mark);
        // }

        // for(int ele:marks){
        //     sum+=ele;
        // }
        // System.out.print(sum);

        // int max=Integer.MIN_VALUE;

        // for(int ele:marks){
        //     max= max>ele?max:ele;
        // }
        // System.out.println("The max is : "+max);

        // int min=Integer.MAX_VALUE;
        // for(int ele:marks){
        //     min= min<ele?min:ele;
        // }
        // System.out.println("The min is : "+min);

        // int n=sc.nextInt();

        // int []arr=new int[n];

        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }

        // for(int ele:arr){
        //     System.out.println(ele);

        // }

      int n=sc.nextInt();

       int arr[]=new int[n];
       
       int firstmax=Integer.MIN_VALUE;       
       int secondmax=Integer.MIN_VALUE; 
       int thirdmax=Integer.MIN_VALUE; 

       for(int i=0;i<n;i++) arr[i]=sc.nextInt(); 
       
       for(int i=0;i<arr.length;i++){  
         if(arr[i]>=firstmax){   
          thirdmax=secondmax; 
           secondmax=firstmax;   
           firstmax=arr[i];      
         }
          if(arr[i]>secondmax && arr[i]<firstmax){
            thirdmax=secondmax;
            secondmax=arr[i];

          } 
          if(arr[i]>thirdmax && arr[i]<secondmax){
            thirdmax=arr[i];

          } 
       }
       System.out.println("First Max: "+firstmax);
       System.out.println("Second Max: "+secondmax);
       System.out.println("Second Max: "+thirdmax);
    }
}