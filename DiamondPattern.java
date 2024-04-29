class DiamondPattern
{
  public static void main(String[] args) {
  	int n= 8;
  	int start = 1, space = n/2;
  	for (int i =0;i<n ;i++ )
    {
  		for (int j =0;j<space ;j++ )
  		 {
  			System.out.print(" "+" ");
  		}
  		for (int j=0;j<start ;j++ )
  		 {
  			System.out.print("*"+" ");
  		}
  		System.out.println();
  		if (i<n/2)
  		 {
  			space--;
  			start+=2;
  		}
  		else{
  			space++;
  			start -=2;
  		}
  	}
  }
}