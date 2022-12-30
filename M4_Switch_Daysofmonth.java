//GET THE MONTH NAME AND DAYS IN THE MONTH BASED ON NUMBER OF MONTH OF CALENDER USING SWITCH CASE
import java.util.Scanner;
public class M4_Switch_Daysofmonth {
    public static void main(String[] args)
{
        Scanner aqq = new Scanner(System.in);
        System.out.println("Enter the Month Number");
        int N = aqq.nextInt();
        switch (N)
        {
            case 1:
            System.out.println("Month: January");
            System.out.println("Number of Days: 31");
            break;
            case 2:
            System.out.println("Month: February");
            System.out.println("Number of Days: 28");
            break;
            case 3:
            System.out.println("Month: March");
            System.out.println("Number of Days: 31");
            break;
            case 4:
            System.out.println("Month: April");
            System.out.println("Number of Days: 30");
            break;
            case 5:
            System.out.println("Month: May");
            System.out.println("Number of Days: 31");
            break;
            case 6:
            System.out.println("Month: June");
            System.out.println("Number of Days: 30");
            break;
            case 7:
            System.out.println("Month: July");
            System.out.println("Number of Days: 31");
            break;
            case 8:
            System.out.println("Month: August");
            System.out.println("Number of Days: 31");
            break;
            case 9:
            System.out.println("Month: September");
            System.out.println("Number of Days: 30");
            break;
            case 10:
            System.out.println("Month: October");
            System.out.println("Number of Days: 31");
            break;
            case 11:
            System.out.println("Month: November");
            System.out.println("Number of Days: 30");
            break;
            case 12:
            System.out.println("Month: December");
            System.out.println("Number of Days: 31");
            break;
            default:
            System.out.println("Enter Valid Month out of 1 to 12.");
            }
}
}
