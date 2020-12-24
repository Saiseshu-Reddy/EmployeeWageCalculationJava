public class empWage
{
	public static void main(String[] args)
	{
	System.out.println("Welcome to Employee Wage Calculation Program on Master Branch");
   	int isPresent = 1;
	int empRatePrHr = 20;
	int empHr = 8;
    	int empCheck=(int)Math.floor(Math.random() * 10) % 2;
    	System.out.println(empCheck);
    	if (empCheck == isPresent) {
		System.out.println("Employee is Present");
		int perDaySalary = empRatePrHr * empHr;
		System.out.println("Employee per day salary = "+perDaySalary);	//Daily wage calculation if employee is present
	}
    else
		System.out.println("Employee is Absent");
	}
}
