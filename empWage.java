class EmpSalary {
	//Constants
	public static final int isFullTime = 0;
	public static final int isPartTime = 1;
	public static final int empRatePrHr = 20;
	public static final int totalWorkingDays = 20;
	public void empSalary() {
		//Variables
		int empHr=0;
		int perDaySalary=0;
		int monthlyWage=0;
		int monthlyHrs=0;
		//Wage Calculation Part starts from here
		for (int i=1;i <= totalWorkingDays && monthlyHrs < 100;i++)
		{
                	int empCheck=(int)Math.floor(Math.random() * 10) % 3;
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
                	monthlyHrs = monthlyHrs + empHr;
               		System.out.println("Working Day: "+i);
	                System.out.println("Total Working Hrs: "+monthlyHrs);
        	        perDaySalary =  empRatePrHr * empHr;
                	System.out.println(perDaySalary);
	                monthlyWage = perDaySalary + monthlyWage;
        	}//for loop
		System.out.println("Monthly Wage of employee is: "+monthlyWage);
	}	//empSalary()
}	//EmpSalary

public class empWage
{
	public static void main(String[] args)
	{
	System.out.println("Welcome to Employee Wage Calculation Program on Master Branch");
	EmpSalary empWage = new EmpSalary();
	empWage.empSalary();
	}//main function
}//class
