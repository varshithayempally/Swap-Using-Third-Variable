import java.util.Scanner;
public class Swapusingthirdvariable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=scanner.nextInt();
        System.out.println("enter the secoond number:");
        int b=scanner.nextInt();
        System.out.println("\nbefore swapping:a="+a+",b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping:a="+a+",b="+b);
        scanner.close();
    }    
}
