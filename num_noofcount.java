import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i,n,count=0;
	    Scanner input=new Scanner(System.in);
	    n=input.nextInt();
	    while(n>0)
	    {
	        count=count+1;
	        n=n/10;
	    }
	    System.out.println(count);
	}
}
