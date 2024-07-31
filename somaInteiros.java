import java.util.Scanner;

public class somaInteiros{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int inteiro1;
        int inteiro2;
        int soma = 0;

        System.out.println("Digite um número: ");
        inteiro1 = input.nextInt();

        System.out.println("Digite outro número: ");
        inteiro2 = input.nextInt();

        int valorMinimo = Math.min (inteiro1, inteiro2);
        int valorMaximo = Math.max (inteiro1, inteiro2);

        for(int i = valorMinimo + 1; i < valorMaximo; i++){
            soma += i;
        }

        System.out.println("O resultado da soma dos inteiros entre os dois numeros digitados é: " + soma);

        input.close();
    }
}
