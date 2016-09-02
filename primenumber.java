public class primenumber
{
    public static void main(String args[])
    {
         int s1=2, s2=15, s3, flag = 0, i, j;
         Scanner s = new Scanner(System.in);
         System.out.println ("enter the limits"); 
         s1 = s.nextInt();
       
         s2 = s.nextInt();

         for(i = s1; i <= s2; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
    
    }}
