import java.util.*;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int Nnum = num+1;
		boolean flag = false;
		int sqrrt = 0;
		for (int i = 1;i<=Nnum/2 ;i++ )
		{
			if (i*i==Nnum) 
			{
				flag = true;
				sqrrt = i;
				break;
			}
		}
		if (flag)
		{
			System.out.println(sqrrt + " is a perfect sqrrt of num is sunny number  " + Nnum);
		}
		else
		{
           System.out.println(Nnum + " do not have a perfect sqrrt num is not a sunny Number ");
		}
	}
}