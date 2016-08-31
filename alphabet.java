public class alphabet {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter any character");
char c=s.next().charAt(0);
if(c>='A'&&c<='Z'||c>='a'&&c<='z')
{
System.out.println(c+"is an Alphabet");
}
else
{
System.out.println(c+"is not an Alphabet");
}
}
}
