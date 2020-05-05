public class EmpWageBuilderUC2{
	public static int Wage_Per_Hours=20;
	public static int Full_Time=16;
	public static final int Full_Day=1;
	public static int Part_Time=8;
	public static final int Part_Day=2;
	public static int Time=0;

	public static void PresentAbsent(int Status){
		int Daily_Wage=0;
		switch ( Status )
		{
		case Full_Day :
			Time=Full_Time;
			break;
			 
		case Part_Day :
			Time=Part_Time;
			break;
		default :
		
			System.out.println("Employee is Absent ");
			System.out.println("Daily Wage is :"+Daily_Wage);
			return ;
		}
		Daily_Wage=Wage_Per_Hours*Time;
		System.out.println("Daily Wage is :"+Daily_Wage);
		return;
		
	}
	
	public static void main(String[] args){

	int CheckStatus = (int)(Math.floor(Math.random()*10)%3);
	
	PresentAbsent(CheckStatus);

	}

}
