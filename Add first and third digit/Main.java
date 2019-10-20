import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int result,n2,n3;
      n2=n1/100;
      n3=n1%10;
      result=n2+n3;
      System.out.println(result);
	}
}