
import java.util.Scanner;

public class   F_Multiplication_table{
    public static void main(String[] args) {
    Scanner userInput= new Scanner(System.in);
    int num= userInput.nextInt();
    for(int i=1; i<=12; i++)
    {
        System.out.println(""+num+" * "+i+ " = "+(i*num));
    }
    userInput.close();
    }
}