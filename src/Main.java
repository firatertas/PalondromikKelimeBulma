import java.util.Scanner;

public class Main {
    public static void Palindrom(String str){
        String reverse = "";
        for (int i = str.length()-1; 0 <=i ; i--) {
            reverse+=str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println("Girilen veri bir Palindomik Kelime'dir.");
        }else {
            System.out.println("Girilen veri bir Palindomik Kelime değildir.");
            System.out.println("Girilen kelime değeri : "+reverse);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("İncelemek istediğiniz kelimeyi giriniz : ");
        String str = scan.nextLine();
        Palindrom(str);
    }
}