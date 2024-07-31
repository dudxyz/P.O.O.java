import java.util.Scanner;

public class parqueDeDiversoes {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int idade;
        float altura;

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        System.out.println("Digite sua altura: ");
        altura = input.nextFloat();

        if ((idade < 18) || (altura <= 1.5)){
            System.out.println("Você não pode entrar neste brinquedo, são apenas permitidos maiores de idade e pessoas com altura superior a 1,5m.");
        } else {
            System.out.println("Parabéns, você pode entrar nesse brinquedo.");
        }
         
        input.close();
    } 
}
