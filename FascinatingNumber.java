import java.util.Scanner;
class FascinatingNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num1 =sc.nextInt(); //327
		int num2 =num1*2;   //654
		int num3 =num1*3; //981
		String concat =""+num1+num2+num3; //327654981
        boolean flag =  true;
        for (char ch = '1';ch<='9' ;ch++ )
         {
            int count = 0;
            for (int i =0;i<concat.length() ;i++ )
             {
            	char ch2 = concat.charAt(i);
            	if(ch2==ch)
            		count++;
            }
            if (count>1||count==0) 
            {
              flag =false;	
            }
        		}	
        		System.out.println(flag? num1+" is a fascinating number ": num1+ " is not a fascinating number");	
		
	}
}