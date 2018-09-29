import java.util.Scanner;

class bobthebuilderiscool
{
  public static void main(String [] args)
  {
    System.out.println("JJJJ      A     V     V     A");
    System.out.println(" JJJ     A A     V   V     A A");
    System.out.println("  JJ    AAAAA     V V     AAAAA"); 
    System.out.println("   J   A     A     V     A     A");
    
    int a = 10;
    int b = 5;
    
    //addition
    int sum = a + b;
     System.out.println(sum);
     
    //subtration
    int sub = a - b;
         System.out.println(sub);
         
    //multipulcation
    int mult = a*b;
    System.out.println(mult);
    
    //division
    int div = a/b; //what number will be?
    System.out.println(div);
   
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number");
    int n1 = input.nextInt();
    System.out.println("Enter second number");
    int n2 = input.nextInt();
    
    //addition
    int sum2 = n1 + n2;
    System.out.println("The sum of these two numbers:"+ sum2 );
    //subtraction
    int sub2 = n1 - n2;
    System.out.println ("The sub of these two numbers:" +sub2);
    //multipulcation
    int mult2 = n1*n2;
    System.out.println("The mult of these two numbers:" + mult2);
    //division
    int div2 = n1/n2;
    System.out.println("The div of these two numbers:" + div2);
  }
}

