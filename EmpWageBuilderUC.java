public class EmpWageBuilderUC{
	
	static void PresentAbsent(int Status){
		if ( Status == 1)
		{
			System.out.println("Employee is Present");
		}else
		{
			System.out.println("Employee is Absent ");
		}
	}
	
	public static void main(String[] args){

	int CheckStatus = (int)(Math.floor(Math.random()*10)%2);
	
	PresentAbsent(CheckStatus);

	}

}
