import java.util.Scanner;

public class Linearsearcgh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[10];
 		int sea = 0 ;
 		int flag = 1;
 		
 		System.out.println("enter the number");
 		for(int i=0;i<n;i++) {
 			a[i]=sc.nextInt();
 		}
 		System.out.println("Enter search key");
 		sea=sc.nextInt();
 		for(int i=0;i<n;i++) {
 			if(a[i]==sea) {
 				System.out.println("Found " + (i+1));
 				flag =1;
 				break;
 				
 			}
 		}
 		if(flag==0) {
 			System.out.println("not found");
 		}
	}

}
