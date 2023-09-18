import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int szam1 = scn.nextInt();
        System.out.println("Please enter the second number:");
        int szam2 = scn.nextInt();

        if(szam1 >= szam2){
            System.out.println("The second number should be bigger");
            System.exit(1);
        }

        for(int i = szam1;i < szam2;i++){
            System.out.println(i);
        }
    }
}