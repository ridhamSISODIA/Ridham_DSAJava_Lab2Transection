package transection;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		int days;
		Scanner sc= new  Scanner(System.in);
		System.out.println("plz enter number of days shop was open");
		days=sc.nextInt();
		int trans[]=new int[days];
		for (int i = 0; i < trans.length; i++) {
			System.out.println("plz enter income of the day"+(i+1));
			trans[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(trans));
		System.out.println("plz enter number of targets");
		int targets=sc.nextInt();
		int sum,flag;
		for (int i = 1; i <= targets; i++) {
			sum=0; 
			flag=0;
			System.out.println("plz enter target"+i);
			int target=sc.nextInt();
			for (int k = 0; k < trans.length; k++) {
				sum=sum+trans[k];
				if(sum>=target)
				{
					flag=1;
					System.out.println("target achive on day"+(k+1));
					break;
				}
			}
			if (flag==0)
				System.out.println("target not achive");
		}
	}

}
