import java.util.Scanner;
public class Main{
public static void main(String[] args){
int n,d,r,s=0;
Scanner input=new Scanner(System.in);
n=input.nextInt();
d=n;
while(n>0)
{
r=n%10;
s=s*10+r;
n=n/10;
}
if(s==d)
System.out.println("yes");
else
System.out.println("no");
}
}
