import java.util.Scanner;
public class Aula03 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        String x;
        int y;
        double h;

        x = sc.next();
        y = sc.nextInt();
        h = sc.nextDouble();

        System.out.println("Voce digitou:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(h);
        
        sc.close();
    }
}
