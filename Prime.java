# Prime
import java.util.Scanner;




public class Prime {

	
	public static void main(String[] args) {
	    int i;
		int j;
		int a[]=new int[100];
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input1:");
		int input1=sc.nextInt();
		System.out.println("Enter input1:");
		int input2=sc.nextInt();
		for(int h=input1;h<=input2;h++)
		{
			int flag=0;
			for(j=2;j<h;j++)
			{
				if(h%j==0)
				{
					flag=1;
					break;
				}
			}
				if(flag==0)
				{
					a[k]=h;
					System.out.println(a[k]);
					k++;
				}
		}
	}
}
