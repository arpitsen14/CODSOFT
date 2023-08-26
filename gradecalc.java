import java.util.Scanner;

public class gradecalc {
    public static void main(String[] args) {
        float number[]=new float[7];
        float sum=0;
        Scanner input=new Scanner(System.in);

        System.out.println("enter the total number of subjects");
        int tOtal_sub=input.nextInt();
        System.out.println("PLEASE ENTER THE MARKS OF "+tOtal_sub+" SUBJECTS:");
        for (int i=0;i<tOtal_sub;i++)
        {
            number[i]=input.nextFloat();
            sum+=number[i];
        }
        float average=sum/tOtal_sub;
        String grade="";
        if(average>=95 && average<=100)
        {
            grade="A+";
        }
        else if(average>=90 && average<95)
        {
            grade="A";
        }
        else if(average>=85 && average<90)
        {
            grade="B+";
        }
        else if(average>=80 && average<85)
        {
            grade="B";
        }
        else if(average>=75 && average<80)
        {
            grade="C+";
        }
        else if (average>=70 && average<75)
        {
            grade="C";
        }
        else if (average>=65 && average<70)
        {
            grade="D+";
        }
        else if(average>60 && average<65)
        {
            grade="D-";
        }
        else if(average>=45 && average<60)
        {
            grade="E";
        }
        else if(average>=33 && average<45)
        {
            grade="E-";
        }
        else if(average>=0 && average<33)
        {
            grade="FAIL";
        }
        else
            grade="INVALID INPUT!!";
        
        if(grade.equals("INVALID INPUT!!"))
            System.out.println("Invalid input Please enter the marks again");
        else
            System.out.println("Total Marks="+sum);
            System.out.println("Percentage="+average);
            System.out.println("GRADE="+grade);
    }
}
