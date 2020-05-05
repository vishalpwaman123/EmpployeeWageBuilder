import java.util.*;

public class EmpWageBuilderUC{
    public static int Full_Time=8;
    public static final int Full_Day=1;
    public static int Part_Time=4;
    public static final int Part_Day=2;
    public static int Time=0;
    public static int TotalWage=0;


    public static void CompanyWage(Dictionary EWageStorage,String Company, int EmpRate, int NumberOfDay, int MaxHours){
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
       // System.out.println("Total Hours :"+Hours_Counter);
       // System.out.println("Total Days :"+Days_Counter);
       // System.out.println("Total "+Company+" Employee Wage :"+TotalWage);
	EWageStorage.put(Company,TotalWage);
    }

	public static void Display(Dictionary EWageStorage)
	{
	Enumeration i = EWageStorage.elements();
	Enumeration j = EWageStorage.keys();
	for (; j.hasMoreElements() ;)
	{
	
	System.out.println("Company Name :"+j.nextElement()+ "              Total Employee Wage :"+i.nextElement());
	
	}
	
	}
    public static void main(String[] args){

        //int CheckStatus = (int)(Math.floor(Math.random()*10)%3);
	Dictionary EWageStorage = new Hashtable();
        CompanyWage(EWageStorage,"Dmart",20,2,10);
	CompanyWage(EWageStorage,"RelianceMart",40,4,20);
	Display(EWageStorage);
    }

    }
