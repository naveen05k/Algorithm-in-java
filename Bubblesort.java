import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		int n;
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}

}
