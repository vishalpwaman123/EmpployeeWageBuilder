public class EmpWageBuilderUC{
	public static int Wage_Per_Hours=20;
	public static int Full_Time=16;
	public static int Part_Time=8;
	public static int Time=0;

	public static void PresentAbsent(int Status){
		int Daily_Wage=0;
		if ( Status == 1 )
		{
			Time=Full_Time;
			 
		}else if ( Status == 2 )
		{
			Time=Part_Time;
		}else
		{
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
