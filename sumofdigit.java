import java.util.Scanner;
class sumofdigit
{
	public static void main(String args[])
	{
	int num;
	int sum=0;
	int r;
	Scanner obj=new Scanner(System.in);
	
	System.out.print("Enter the number=");
	num=obj.nextInt();
	
	while(num>0)
	{
	r=num%10;
	sum=sum+r;
	num=num/10;
	}
	System.out.print("Sum of digit="+sum);
		
	}
}