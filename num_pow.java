import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,i,k;
	    int pow=1;
	    Scanner input=new Scanner(System.in);
	    n=input.nextInt();
	    k=input.nextInt();
	    for(i=1;i<=k;i++)
	    pow=pow*n;
		System.out.println(pow);
	}
}
