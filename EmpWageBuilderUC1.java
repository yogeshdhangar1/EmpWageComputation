package  javapractice;
class EmpAttendence{
	int isFullTime ;
	
	public EmpAttendence (int isFullTime , int x ) {
    System.out.println("Parameterized constructor called");
    isFullTime =  x;
	
}
public class EmpWageBuilderUC1 {
	
public static void main(String[] args) {
	int IS_FULL_TIME=1;
	double empCheck= Math.floor(Math.random() * 10) % 2 ;
	if (empCheck== IS_FULL_TIME )
		System.out.println("Employee is Present");
	else
		System.err.println("Employee is Absent");
	
}
}
}

