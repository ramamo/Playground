import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n1,r,rev=0;
    n1=in.nextInt();
    while(n1>0)
    {
      r=n1%10;
      rev=(rev*10)+r;
      n1=n1/10;
    }
    System.out.println(rev);
    
  }
}