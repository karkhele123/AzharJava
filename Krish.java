class Krish
{
	public static void main(String[] args){
		for (int j=1;j<=500000 ;j++ ) 
		{
		int num = j;
		int dup = num ;
		int sum =0;
		while(num>0)  // 145>0 (true) //14>0 (true) // 1>0 (true) // 0>0 (false)
		{
			int rem = num%10;  //145%10 = 5  //14%10 = 4 // 1%10 = 1
			int fact=1;
			for(int i=1;i<=rem;i++)  // 1<=5 //1<=4 // 1<=1
			{
				fact*=i;    // 5*4*3*2*1=120 //  //4*3*2*1 =24 //1*1 =1
			}
			sum+=fact;  // 0+120=120 //120+24 =144 //  144+1 =145
			num/=10;       //145/10= 14 // 14/10 = 1 // 1/10 = 0
		}
		if (sum==dup) {
			System.out.println(num);
			
		}
		//System.out.println(sum==dup?"KRIS":"Not Krish");
	}
}
}