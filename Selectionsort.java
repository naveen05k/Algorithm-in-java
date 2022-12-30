import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a[] = new int [10];
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int index=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[index]) {
					index =j;
				}
			}
			int temp = a[index];
			a[index]= a[i];
			a[i]= temp;
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}

}
