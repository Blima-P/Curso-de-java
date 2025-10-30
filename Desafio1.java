import java.util.Scanner;
public class Desafio1 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora em Java");
        
        System.out.print("Escreva o primeiro numero");
        double num1 = sc.nextDouble();

        System.out.print("Digite o operador(+,-,*,/.. e etc)");
        char operador = sc.next().charAt(0);


        System.out.println("Escreva o segundo numero");
        double num2 = sc.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case '+' -> resultado = num1 + num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Erro : Divisão por zero não é permitida!");
                    operacaoValida = false;
                } else {
                    resultado = num1 / num2;
                }
            }
            case '-' -> resultado = num1 - num2;
            default -> {
                System.out.println("Erro! Operador invalido");
                operacaoValida = false;
            }
        }
        if (operacaoValida){
            System.out.println("\nResultado: " + num1 + " " + operador + " " + num2 + " = " + resultado);
            sc.close(); 
        }
    }
}
