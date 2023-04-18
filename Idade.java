import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //achei essa biblioteca na internet :D
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int idade;
        
        for (int i = 1; i < 13; i++) {
            System.out.println("Digite a idade da pessoa: ");
            idade = scanner.nextInt();

            if (idade > maior) {
                maior = idade;
            }
            if (idade < menor) {
                menor = idade;
            }
        }

        System.out.println("Maior idade: " + maior);
        System.out.println("Menor idade: " + menor);

        scanner.close();
    }
}