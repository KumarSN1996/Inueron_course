
import java.util.*;
public class Pattern3
{
	public static void main(String[] args) {
	 {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n");
        int n = sc.nextInt();
       for (int row=1;row<=(2*n);row++)
        {
            for (int colm=1;colm<=(2*n);colm++)
            {
                if( ( row+colm <= n+1 ) || (colm -row >=n) ||
                        (row == 2*n) || (colm == 1) || (colm == 2*n))
                
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }}}
