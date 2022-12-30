import java.util.Scanner;

public class Binearysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a[] = new int [10];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		
		int first =0;
		int last = n-1;
		int mid = (first + last)/2;
		System.out.println("Enter the search elements");
		int key = sc.nextInt();
		while(first <= last) {
			if(a[mid] < key ) {
				first = mid +1;
				mid = (first+ last)/2;
			}
			else if(a[mid]==key) {
				System.out.println("Elements found");
				break;
			}
			else {
				last = mid -1 ;
				mid = (first+ last)/2;
			}
				
		}
		if(first>last) {
			System.out.println("Not found");
		}

	}

}
