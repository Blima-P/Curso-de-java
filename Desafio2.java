import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);  

        System.out.println("Escreva o valor em Celsius ");
        double C = sc.nextDouble();
        
        double F = (C * 1.8) + 32;

        System.out.println(C +"C é igual a " + F +"F.");

        sc.close();


    }
}
