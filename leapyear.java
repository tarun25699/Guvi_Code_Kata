import java.util.Scanner;
public class Main
{
public static void main(String args[]){
Scanner inp=new Scanner(System.in);
int year=inp.nextInt();
if(year%4 == 0)
    {
        if( year%100 == 0)
        {
            // year is divisible by 400, hence the year is a leap year
            if (year%400 == 0)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        else
            System.out.println("yes");
    }
    else
        System.out.println("no");
}
}
