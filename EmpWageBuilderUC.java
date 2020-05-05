public class EmpWageBuilderUC{
	public static int Wage_Per_Hours=20;
	public static int Full_Time=16;
	public static final int Full_Day=1;
	public static int Part_Time=8;
	public static final int Part_Day=2;
	public static int Time=0;
	public static int TotalWage=0;
	public static int Max_Hours=100;
	public static int Max_Days=20;
	public static int Hours_Counter=0;
	public static int Days_Counter=0;

	public static void PresentAbsent(){
	int CheckStatus=0;
	int Daily_Wage=0;
	for (  ; Days_Counter <= Max_Days && Hours_Counter <= Max_Hours ;  ){
		
		Days_Counter++;
		
		CheckStatus=(int)(Math.floor(Math.random()*10)%3);
		
		switch ( CheckStatus )
		{
		case Full_Day :
			Time=Full_Time;
			break;
			 
		case Part_Day :
			Time=Part_Time;
			break;
		default :
			Time=0;
			//System.out.println("Employee is Absent ");
			//System.out.println("Daily Wage is :"+Daily_Wage);
			
		}
		Hours_Counter=Hours_Counter+Time;
		Daily_Wage=Wage_Per_Hours*Time;
		TotalWage=TotalWage+Daily_Wage;
		System.out.println("Day "+(Days_Counter)+" Wage is :"+Daily_Wage);
	}
		
		Hours_Counter=Hours_Counter-Time;
		TotalWage=TotalWage-Daily_Wage;
		System.out.println("Total Hours :"+Hours_Counter);
		System.out.println("Total Days :"+Days_Counter);
		System.out.println("Total Month Wage :"+TotalWage);
}
	public static void main(String[] args){

	//int CheckStatus = (int)(Math.floor(Math.random()*10)%3);
	
	PresentAbsent();

	}

}
