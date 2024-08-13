import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner Scanner = new  Scanner(System.in);
       
        System.out.println("enter frisrt number");
        int num1 = Scanner.nextInt();
        Scanner Scanner2 = new Scanner(System.in);
        System.out.println("enter second");
        int num2  = Scanner2 .nextInt();
        if (num1  > num2)
        {System.out.println("frist number is greter");
       }
        else if(num1<num2){
        System.out.println("second number is greater");
    }
         else{ System.out.println("both number are equal");
}
    }
} 
