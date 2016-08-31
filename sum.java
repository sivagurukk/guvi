public class sum {
public static void main(String[] args)
{
int sum=0,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter n value");
int n=s.nextInt();
for(i=0;i<n;i++)
{
sum=sum+i;
}
System.out.println("sum is"+sum);
}
}
