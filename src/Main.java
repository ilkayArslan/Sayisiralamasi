import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2,num3;
        System.out.print("1. sayıyı lütfen giriniz : ");
        num1 = input.nextInt();
        System.out.print("2. sayıyı lütfen giriniz : ");
        num2 = input.nextInt();
        System.out.print("3. sayıyı lütfen giriniz : ");
        num3 = input.nextInt();
        if(num1<=num2 && num1<=num3){
            if(num2<=num3){
                System.out.println("Sıralama : "+num1+","+num2+","+num3);
            } else  {
                System.out.println("Sıralama : "+num1+","+num3+","+num2);
            }
        } else if (num1>=num2 && num1>=num3) {
            if(num2<=num3){
                System.out.println("Sıralama : "+num2+","+num3+","+num1);
            } else  {
                System.out.println("Sıralama : "+num3+","+num2+","+num1);
            }
        } else {
            if(num2<=num3){
                System.out.println("Sıralama : "+num2+","+num1+","+num3);
            } else  {
                System.out.println("Sıralama : "+num3+","+num1+","+num2);
            }
        }
    }
}