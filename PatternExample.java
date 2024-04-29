// class PatternExample
// {
// 	public static void main(String[] args) 
// 	{
// 	 int num= 5;
// 	 char ch= 'a';
// 	 for (int i = 5;i>=1 ;i-- ) 
// 	 {
// 	   for (int j =5;j>i ;j-- )    
// 	   {
// 	   		System.out.print("  ");
// 	   	}	
// 	   	for (int j =1;j<=i ;j++ ) 
// 	   	{
// 	   	 if (i%2!=0) 
// 	   	 {
// 	   	 System.out.print(num++ +" ");		
// 	   	 	}	
// 	   	 	else
// 	   	 	{
//              System.out.print(ch++ +" ");
// 	   	 	}
// 	   	}
// 	   	if (i==4) 
// 	   	{
// 	   	  num =num-8;	
// 	   	}
// 	   	else if (i==2) 
// 	   	{
// 	   	 num =num-4;	
// 	   	}
// 	   	else if (i==3) 
// 	   	{
// 	   	 ch='a';
// 	   	}
// 	   	System.out.println();
// 	 }
// 	}
// }


// 5 6 7 8 9
//   c d e f 
//     2 3 4
//       a b 
//         1  

// class PatternExample
// {
// 	public static void main(String[] args) {
// 		int a = 1;
// 		int b =2;
// 		for (int i =1;i<=5 ;i++ ) 
// 		{
// 		for (int j = 1;j<=i ;j++ ) 
// 		{
// 		if (i%2==0) 
// 		{
// 		System.out.print(b+"  ");
// 		b=b+2;			
// 				}	
// 				else{
// 					System.out.print(a+"  ");
// 					a=a+2;
// 				}	
// 			}	
// 							System.out.println();

// 		}
// 	}
// }





// 1 
// 2 4
// 3 5 7
// 6 8 10 12
// 9 11 13 15 17



class PatternExample
{
	public static void main(String[] args) 
	{
		int a =1;
		int b =0;
	 for (int i = 1;i<=5 ;i++ ) 
	 {
	 for (int j = 1;j<=i ;j++ ) 
	 {
	 		if (i%2==1) 
	 		{
	 		   System.out.print(a+" ");
	 		   a =1-a	;	
	 			}	
	 		else
	 		{
              System.out.print(a+" ");
              b=0-1;
	 		}
	 		}	
	 		System.out.println();	
	 	}	
	}
}      



       
//         1
//       0 1
//     1 0 1 
//   0 1 0 1
// 1 0 1 0 1