import java.util.Scanner;

public class CaixaAutomatico {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String nome;
        int valor;
        int notasCinquenta;
        int notasVinte;
        int notasDez;
        int notasUm;

        System.out.println("Escreva o seu nome: ");
        nome = input.nextLine();

        System.out.println("Digite o valor que deseja sacar: ");
        valor = input.nextInt();

        notasCinquenta = valor / 50;
        valor %= 50;
        notasVinte = valor / 20;
        valor %= 20;
        notasDez = valor / 10;
        valor %= 10;
        notasUm = valor;

        System.out.println("Olá " + nome + ", você receberá: ");

        if (notasCinquenta > 0)
        {
            System.out.println(notasCinquenta + " nota(s) de 50 reais.");
        }
        if (notasVinte> 0)
        {
            System.out.println(notasVinte + " nota(s) de 20 reais.");
        }
        if (notasDez > 0)
        {
            System.out.println(notasDez + " nota(s) de 10 reais.");
        }
        if (notasUm > 0)
        {
            System.out.println(notasUm + " nota(s) de 1 real.");
        }
        
        input.close();
    } 
}
