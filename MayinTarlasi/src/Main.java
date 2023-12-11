import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Satır sayısı: ");
        int satir=input.nextInt();
        System.out.println("Sutun sayısı: ");
        int sutun=input.nextInt();
        MineSweeper mayin;
        mayin = new MineSweeper(satir,sutun);
        mayin.Calistir();

    }
}