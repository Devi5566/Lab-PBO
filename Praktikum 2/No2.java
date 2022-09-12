import java.util.Scanner;

public class No2
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai: ");
        nilai=input.nextInt();

        if(nilai<41){
            System.out.println("Nilai E");
        }
        else if(nilai>=41 && nilai<51){
            System.out.println("Nilai D");
        }
        else if(nilai>=51 && nilai<60){
            System.out.println("Nilai C");
        }
        else if(nilai>=60 && nilai<69){
            System.out.println("Nilai BC");
        }
        else if(nilai>=69 && nilai<78){
            System.out.println("Nilai B"); 
        }else if(nilai>=78 && nilai<87){
            System.out.println("Nilai AB");
        }
        else if(nilai>=87 && nilai<=100){
            System.out.println("Nilai A");
        }else{
            System.out.println("Invalid!");
        }

        if(nilai<41){
            System.out.println("IP 0.00");
        }
        else if(nilai>=41 && nilai<51){
            System.out.println("IP 1.00");
        }
        else if(nilai>=51 && nilai<60){
            System.out.println("IP 2.00");
        }
        else if(nilai>=60 && nilai<69){
            System.out.println("IP 2.50");
        }
        else if(nilai>=69 && nilai<78){
            System.out.println("IP 3.00"); 
        }else if(nilai>=78 && nilai<87){
            System.out.println("IP 3.50");
        }
        else if(nilai>=87 && nilai<=100){
            System.out.println("IP 4.00");
        }else{
            System.out.println("Invalid!");
        }
    }
}