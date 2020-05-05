import java.util.*;

public class EmpWageBuilderUC{
    public static int Full_Time=8;
    public static final int Full_Day=1;
    public static int Part_Time=4;
    public static final int Part_Day=2;
    public static int Time=0;
    public static int TotalWage=0;
    
    public static String Company_Name;
    public static int EmpRate;
    public static int NumberOfDay;
    public static int MaxHours;
    
    public EmpWageBuilderUC( String Company_Name , int EmpRate , int NumberOfDay , int MaxHours )
    {
    
    this.Company_Name=Company_Name;
    this.EmpRate=EmpRate;
    this.NumberOfDay=NumberOfDay;
    this.MaxHours=MaxHours;
    
    }


    public static int CompanyWage(){
      	
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
                    

            }
            Hours_Counter=Hours_Counter+Time;
            Daily_Wage=EmpRate*Time;
            TotalWage=TotalWage+Daily_Wage;
           
        }

        Hours_Counter=Hours_Counter-Time;
        TotalWage=TotalWage-Daily_Wage;
        return TotalWage;
	
    }


    public static void main(String[] args){

        EmpWageBuilderUC DmartObject = new EmpWageBuilderUC("Dmart",20,2,10);	
        System.out.println("Total "+DmartObject.Company_Name+" Employee Wage :"+DmartObject.CompanyWage());
	EmpWageBuilderUC RelianceObject = new EmpWageBuilderUC("RelianceMart",40,4,20);
	System.out.println("Total "+RelianceObject.Company_Name+" Employee Wage :"+RelianceObject.CompanyWage());
	
    }

    }
