public class EmpWageBuilderUC{
	public static int Wage_Per_Hours=20;
	public static int Full_Time=16;
	public static final int Full_Day=1;
	public static int Part_Time=8;
	public static final int Part_Day=2;
	public static int Time=0;
	public static int TotalWage=0;

	public static void PresentAbsent(){
	int CheckStatus=0;
	for ( int i=0 ; i< 30 ; i++ ){
		
		CheckStatus=(int)(Math.floor(Math.random()*10)%3);
		int Daily_Wage=0;
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
		Daily_Wage=Wage_Per_Hours*Time;
		TotalWage=TotalWage+Daily_Wage;
		System.out.println("Day "+(i+1)+" Wage is :"+Daily_Wage);
	}
		System.out.println("Total Month Wage :"+TotalWage);
}
	public static void main(String[] args){

	//int CheckStatus = (int)(Math.floor(Math.random()*10)%3);
	
	PresentAbsent();

	}

}
