public class No5
{
  public static void main(String args[]){
    System.out.println("Deret bilangan genap kecuali kelipatan 6");
        for(int i=1;i<=20;i++){
            if (i%2==0 && i%6!=0)
            System.out.print(i+" ");
       }
  }
}