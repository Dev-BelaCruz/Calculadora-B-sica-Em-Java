import java.util.Scanner;

public class CalculadoraMatematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir dois números
        System.out.println("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Insira o segundo número: ");
        double num2 = scanner.nextDouble();

        // Operações matemáticas básicas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double raizQuadrada1 = Math.sqrt(num1);
        double raizQuadrada2 = Math.sqrt(num2);
        double potencia = Math.pow(num1, num2);

        // Exibir os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Raiz Quadrada do primeiro número: " + raizQuadrada1);
        System.out.println("Raiz Quadrada do segundo número: " + raizQuadrada2);
        System.out.println("Potência (primeiro número elevado ao segundo número): " + potencia);

        scanner.close();
    }
}
