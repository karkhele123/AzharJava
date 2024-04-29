import java.util.Scanner;
class Calculater
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the num 1");
		double num1 =sc.nextDouble();
		System.out.println("Enter the operation");
		char op = sc.next().charAt(0);
		System.out.println("Enter the num 2");
		double num2 = sc.nextDouble();

		boolean flag = true;
		double output = 0;
		switch(op)
		{
		case '+': output = num1+num2;break;
		case '-': output = num1-num2;break;
		case '*': output = num1*num2;break;
		case '/': output = num1/num2;break;
		case '%': output = num1%num2;break;
		default : System.out.println("invalid operation ");flag = false ;
		}
		if (flag) {
			System.out.println(num1 + " "+op +" "+num2 + " = "+output);
		}
	}
}