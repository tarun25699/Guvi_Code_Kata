import java.util.Scanner;
public class Main
{
public static void main(String args[]){
int sum=0;
Scanner inp=new Scanner(System.in);
int n=inp.nextInt();
for(int i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
