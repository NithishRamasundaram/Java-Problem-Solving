import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String n=sc.nextLine();
        String m=new StringBuilder(n).reverse().toString();
        if (n.equals(m)){
            System.out.println("Given String is palindrome");
        }
        else{
            System.out.println("Given String is not a palindrome");
        }

    }
}
