import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int  num =Scanner.nextInt();
        for (int i=1; i<11; i++){
        System.out.println(num *i);
    }
}
}
