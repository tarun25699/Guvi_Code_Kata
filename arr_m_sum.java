import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i,m,n,sum=0;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        m=input.nextInt();
        int[] num=new int[n];
        for(i=0;i<num.length;i++)
        num[i]=input.nextInt();
        for(i=0;i<m;i++)
        sum=sum+num[i];
        System.out.print(sum);
	}
}
