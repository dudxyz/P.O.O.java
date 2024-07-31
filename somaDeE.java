import java.util.Scanner;

public class valorDeE{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int n;
        float somaDeE = 0;

        System.out.println("Digite um número: ");
        n =  input.nextInt();   

        for(int i = 1; i <= n ; i++){
            somaDeE += 1.0/i;
        }
        
        System.out.println("O resultado da soma de E é: " + somaDeE);

        input.close();
    }
}
