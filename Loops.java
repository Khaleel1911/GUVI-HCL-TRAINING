import java.util.*;
public class Loops {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i==1 || i==6 || j==1 || j==5) System.out.print("* ");
//				else {
//					System.out.print("  8");
//				}
//			}
//			System.out.println();
//		
//		}
		
//		int i=1;
//		while(i<=10) {
//			System.out.println(i++);
//		}
//		
//		for(int i=1;i<=4;i++) {
//			for(int j=4-i;j>=1;j--) {
//				System.out.print("  ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print(i+"   ");
//			}
//			System.out.println();
//		}
		
		//do - while loop
//		int i=1;
//		do {
//			System.out.println(i++);
//		}while(i<=10);
		
		
//		for(int i=0;i<=10;i++) {
//			if(i==3) continue;
//			System.out.println(i);
//		}
//		
//	int count=1;
//	for(int i=1;i<=4;i++) {
//		for(int j=1;j<=i;j++) {
//	
//		if(count==0) {
//			System.out.println(~count);
//		}else {
//			System.out.print(count);	
//		}
//		}
//		System.out.println();
//}
//		
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		
		
		int n=sc.nextInt();

		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print("   ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
