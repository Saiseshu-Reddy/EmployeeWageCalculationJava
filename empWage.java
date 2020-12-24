public class empWage
{
	public static final int isFullTime = 1;
        public static final int isPartTime = 2;
	public static void main(String[] args)
	{
	System.out.println("Welcome to Employee Wage Calculation Program on Master Branch");
	int empRatePrHr = 20;
	int empHr = 0;
	int perDaySalary = 0;
    	int empCheck=(int)Math.floor(Math.random() * 10) % 3;
    	System.out.println(empCheck);
	switch ((int)empCheck)
	{
		case isFullTime :
			empHr = 8;
			System.out.println("Full time Employee");
			perDaySalary = empRatePrHr * empHr;
			System.out.println("Employee per day salary = "+perDaySalary);
			break;
		case isPartTime :
			empHr = 4;
			System.out.println("Part time Employee");
			perDaySalary = empRatePrHr * empHr;
			System.out.println("Employee per day salary = "+perDaySalary);
			break;
		default :
			empHr = 0;
			System.out.println("Employee is Absent");
			perDaySalary = 0;
			System.out.println("Employee per day salary = "+perDaySalary);
	}//switch case
	}//main function
}//class
