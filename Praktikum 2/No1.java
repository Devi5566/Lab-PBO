import java.util.Scanner;

public class No1{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num1,num2;
        
        System.out.print("Masukkan nilai num1: ");
        num1 = input.nextInt();
        
        System.out.print("Masukkan nilai num2: ");
        num2 = input.nextInt();
        
    
        System.out.println("num1 + num2= " + (num1 + num2));
        System.out.println("num1 - num2= " + (num1 - num2));
        System.out.println("num1 * num2= " + (num1 * num2));
        System.out.println("num1 / num2= " + ((double)num1 / num2));
        System.out.println("num1 % num2= " + (num1 % num2));
    }
}
