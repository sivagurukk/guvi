public class largest {
public static void main(String[] args) {
int big;
Scanner s=new Scanner(System.in);
System.out.println("Enter three numbers");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
big=a>b?(a>c?a:c):(b>c?b:c);
System.out.println(big+"is the largest number");
}
}
