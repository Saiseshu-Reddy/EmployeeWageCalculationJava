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
	int totalWorkingDays = 20;
	int monthlyWage = 0;
	for (int i = 1;i <= totalWorkingDays;i++)
	{
    		double empCheck=(int)Math.floor(Math.random() * 10) % 3;
		switch ((int)empCheck)
		{
			case isFullTime :
				empHr = 8;
				break;
			case isPartTime :
				empHr = 4;
				break;
			default :
				empHr = 0;
				break;
		}//switch case
		perDaySalary =  empRatePrHr * empHr;
		monthlyWage = perDaySalary + monthlyWage;
	}//for loop
	System.out.println("Monthly Wage of employee is: "+monthlyWage);
	}//main function
}//class
