public class EmpWageBuilderUC2{
	public static int Wage_Per_Hour=20;
	public static int Full_Day=8;	

	public static void PresentAbsent(int Status){
		int Daily_Wage=0;
		if ( Status == 1)
		{
			Daily_Wage=Wage_Per_Hour*Full_Day;
			System.out.println("Daily Wage is :"+Daily_Wage); 
		}else
		{
			System.out.println("Employee is Absent ");
			System.out.println("Daily Wage is :"+Daily_Wage);
		}
	}
	
	public static void main(String[] args){

	int CheckStatus = (int)(Math.floor(Math.random()*10)%2);
	
	PresentAbsent(CheckStatus);

	}

}
