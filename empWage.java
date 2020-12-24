public class empWage
{
	public static void main(String[] args)
	{
	System.out.println("Welcome to Employee Wage Calculation Program on Master Branch");
   	int isPresent = 1;
      	int empCheck =(int)Math.floor(Math.random() * 10) % 2;
      	System.out.println(empCheck);
      		if (empCheck == isPresent)
      		System.out.println("present");
      		else
      		System.out.println("absent");
	}
}
