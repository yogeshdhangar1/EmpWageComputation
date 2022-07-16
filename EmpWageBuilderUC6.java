package Brideglab.com;

public class EmpWageBuilderUC6 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20 ;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_RATE_IN_MONTH = 10 ;
	
	  public static void main(String[] args) {
		//Variables
		  int empHrs = 0 , totalEmpHrs = 0 , totalWorkinDays = 0 ;
		  //computation 
		 while (totalEmpHrs <= MAX_RATE_PER_HOUR 
				totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++ ;
			 
			 int empCheck = int Math.floor (Math.random () * 10 ) % 3 ;
			 switch empCheck {
			  		Case IS_PART_TIME:
			  		empHrs=4;
			  		break;
			  		case IS_FULL_TIME:
			  			empHrs=8;
			  		break;
			  		default:
			  			empHrs=0;
			  			
			 }
			 totalEmpHrs += empHrs
					 System.out.println("Day#:" + totalWorkinDays +" Emp Hr:+  +empHrs");
			 
			 
		 }
			 int totalEmpWage = totaklEmpHrs * EMP_RATE_PER_HEOUR ;
			 System.out.println("total Emp Wage :" +totalEmpwage  );
	}

}

