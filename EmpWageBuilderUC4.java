package EmpWageBuilderUC4;

public class EmpWageBuilderUC4 {
 public static final int  isPartTime = 1;
 public static final int isFullTime =2;
 public static final int EmpRatePerHour = 20;
 public static final int NumOfWorkingdays = 2;
 public static final int MaxRateInMonth = 10;
   
	public static void main(String[] args) {
		int empHrs = 0 , totalEmpHrs = 0 , totalworkingDays = 0;
		
		while (totalEmpHrs <= MaxRateInMonth  &&
				totalworkingDays <  NumOfWorkingdays) {
			totalworkingDays++;
			 int empCheck = (int)Math.floor(Math.random()* 10)%3;
			 switch (empCheck) {
			 case isPartTime:
				 empHrs = 4;
				 break;
			 case isFullTime:
				 empHrs = 8;
				 break;
			default:
				empHrs = 0;
			 }
			 
			 totalEmpHrs += empHrs;
			 System.out.println("Day#:"  +totalworkingDays +"Emp Hr:+ " +empHrs);
		}
		   int totalEmpWage = totalEmpHrs *EmpRatePerHour;
		   System.out.println("total Emp Wage :"   +totalEmpWage);
		      
		 		 
	}

}