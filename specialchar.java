public class specialchar
{
 
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
String p;
int k=0;
p=sc.nextLine();
char c[]=p.toCharArray();
for(int i=0;i<c.length;i++)
{
if(c[i]-'0'>=10&&c[i]-'0'<=32)
k++;
}
System.out.println("number of special characters is:"+k);
  }
}
