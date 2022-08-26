/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Pattren5
{
	public static void main(String[] args) {
	 {
       Scanner s2 = new Scanner(System.in);
       System.out.println("Enter the value of k");
       int k = s2.nextInt();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (i == 0 || i == k - 1 || (i <= 6 && j <= 5 && (i + j) <= (k - 1) / 2) || i >= 7 && j <= 6 && (i + j) >= ((k - 1) / 2) + (j * 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }}}}
    



		
