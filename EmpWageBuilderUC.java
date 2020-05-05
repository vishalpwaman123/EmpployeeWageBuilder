import java.util.*;

public class EmpWageBuilderUC{
    public static int Full_Time=8;
    public static final int Full_Day=1;
    public static int Part_Time=4;
    public static final int Part_Day=2;
    public static int Time=0;
    public static int TotalWage=0;


    public static void CompanyWage(ArrayList<String>Company_Name,ArrayList<String>Total_Wage,String Company, int EmpRate, int NumberOfDay, int MaxHours){
      	
	int Hours_Counter=0;
        int Days_Counter=0;
        int CheckStatus=0;
        int Daily_Wage=0;
        for (  ; Days_Counter <= NumberOfDay && Hours_Counter <= MaxHours ;  ){

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
            Daily_Wage=EmpRate*Time;
            TotalWage=TotalWage+Daily_Wage;
           // System.out.println("Day "+(Days_Counter)+" Wage is :"+Daily_Wage);
        }

        Hours_Counter=Hours_Counter-Time;
        TotalWage=TotalWage-Daily_Wage;
        Company_Name.add(Company);  
        Total_Wage.add(Integer.toString(TotalWage));
        //System.out.println("Total Hours :"+Hours_Counter);
        //System.out.println("Total Days :"+Days_Counter);
        //System.out.println("Total "+Company+" Employee Wage :"+TotalWage);
	//EWageStorage.put(Company,TotalWage);
    }

	public static void Display(ArrayList<String>Company_Name,ArrayList<String>Total_Wage)
	{
	//Enumeration i = EWageStorage.elements();
	//Enumeration j = EWageStorage.keys();
	Iterator C_Name=Company_Name.iterator();
	Iterator T_Wage=Total_Wage.iterator();
	
	for (; C_Name.hasNext() && T_Wage.hasNext() ;)
	{
	
	System.out.println("Company Name :"+C_Name.next()+ "         Total Employee Wage :"+T_Wage.next());
	
	}
	
	}
    public static void main(String[] args){

        //int CheckStatus = (int)(Math.floor(Math.random()*10)%3);
	//Dictionary EWageStorage = new Hashtable();
	ArrayList<String>Company_Name=new ArrayList<String>();
	ArrayList<String>Total_Wage= new ArrayList<String>();
        CompanyWage(Company_Name,Total_Wage,"Dmart",20,2,10);
	CompanyWage(Company_Name,Total_Wage,"RelianceMart",40,4,20);
	Display(Company_Name,Total_Wage);
    }

    }
