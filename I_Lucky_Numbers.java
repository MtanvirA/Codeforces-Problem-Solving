
import java.util.Scanner;

public class I_Lucky_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean check = false;
        int a = num%10;
        num/=10;
        int b = num%10;

        if((a%b==0) || (b%a==0))
        {
            check = true;
        }

        if(check)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
