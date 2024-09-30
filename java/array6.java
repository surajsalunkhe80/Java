import java.lang.*;
public class array6{
    public static void main(String[]args){
        int[] num=new int[]{11,12,13,14,15};{
        System.out.println("\n value of element 1 ="+num[0]+".");
        System.out.println("\n value of element 2 ="+num[1]+".");
        System.out.println("\n value of element 3 ="+num[2]+".");
        System.out.println("\n value of element 4 ="+num[3]+".");
        System.out.println("\n value of element 5 ="+num[4]+".");
        num[0] =10;
        num[1] =20; 
        num[2] =77;
        num[3] =21;
        System.out.println("\n changed values  in arryas are =>\n");

        System.out.println("\n value of element 1 ="+num[0]+"."); 
        System.out.println("\n value of element 2 ="+num[1]+".");
        System.out.println("\n value of element 3 ="+num[2]+"."); 
        System.out.println("\n value of element 4 ="+num[3]+".");
        System.out.println("\n value of element 5 ="+num[4]+".");
    }
}}