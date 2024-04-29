import java.util.Scanner;
class EmirpNumber
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt(); //17
		int count =0; 
		for (int i = 2;i<num ;i++ ) //2<17 (true) //3<17 (true) //4<17(true)
		{
			if (num%i==0) //17%2 ==1(FALSE) //17%3==2 //17%4==3
			{  
				count++;   //0(1) //1(2) //2(3)
				break;
			}
		}
		boolean flag = count==0?true:false; 
	if (flag)
	 {
		int rev =0;  
		while(num>0) //17>0
		{
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		int count1 = 0;   
		for (int i =2;i<rev ;i++ ) {
			if (rev%i==0) {    
				count1++;
				break;
			}
		}
		boolean flag1 = count1==0?true:false;
		if (flag && flag1) 
		{
		  System.out.println("Emirp Numnber");	
		}
		else{
			System.out.println("Not Emirp Number");
		}
	}
		else{
			System.out.println("not a emirp number");
		}
	}
	}



