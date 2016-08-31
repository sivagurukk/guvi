public class leap {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter year");
int y=s.nextInt();
if(y%4==0)
{
System.out.println(y+"is leap year");
}
else
{
System.out.println(y+"is not leap year");
}
}
}
