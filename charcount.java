public class charcount {
 
 public static void main(String[] args) {
  

 int count
 Scanner s= new Scanner(System.in);
 System.out.println("Please enter a String");
 
 str=in.nextLine();
 
 System.out.println(" enter the Character");
 String chr=s.next();
 
  count = str.length() - str.replaceAll("a", "").length();
 
 System.out.println("Number of occurence:"+count);
 
}

}
