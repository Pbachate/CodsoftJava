import java.util.Scanner;
public class studentGrade
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        int numsub = sc.nextInt();
        if(numsub <= 0)
        {
            System.out.println("Please enter a valid number of the subject.");
            return;
        }
        int totalmark = 0;
        int maxmarkpersubject = 100;
        for(int i =1;i<=numsub;i++)
        {
            System.out.println("Enter marks obtained in subject " + i +" (out of 100):");
            int marks = sc.nextInt();
            if(marks < 0 || marks > maxmarkpersubject)
            {
                System.out.println("Marks should be in the range of 0 to 100.Please enter valid marks.");
                i--;
            }
            else
            {
                totalmark += marks;

            }
        }
        double avgper=(double) totalmark / (numsub * maxmarkpersubject)*100;
        System.out.println("Total Marks : "+ totalmark);
        System.out.println("Average Percentage : " + avgper + "%");

        String grade;
        if(avgper >= 90)
        {
            grade = "A+";
        }
        else if(avgper >= 80)
        {
            grade = "A";
        }
        else if(avgper >= 70)
        {
            grade = "B";
        }
        else if(avgper >= 60)
        {
            grade = "C";
        }
        else if(avgper >= 50)
        {
            grade = "D";
        }
        else
        {
            grade = "F";
        }
        System.out.println("Grade : "+grade);
    
    }
}