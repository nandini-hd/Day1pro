import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int n1 =sc.nextInt();
		int n2=sc.nextInt();
		int sum=n1+n2;
		System.out.println("sum of 2 numbers:"+sum);

	}

}
