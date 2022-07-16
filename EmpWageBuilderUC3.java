package EmpWageBuilderUC3;

public class EmpWageBuilderUC3 {
	public static void main(String[] args) {
		int PartTime = 1;
		int isFullTime =2;
		int empHrs = 0 ,    empDailyWage= 0;
		int empWagePerHour = 20;
		
		double empCheck = (int)Math.floor(Math.random() *10)%3;
		
		if (empCheck == PartTime) {
			empHrs = 8;
			empDailyWage = (empHrs*empWagePerHour);
			System.out.println("Present:-"     +empDailyWage);
		}else if (empCheck == isFullTime) {
		        empHrs = 4;	
			empDailyWage  = (empHrs*empWagePerHour);
			System.out.println("Present:-"       +empDailyWage);
		}else 
			System.out.println("Absent:-"         +empDailyWage);
	}

}
