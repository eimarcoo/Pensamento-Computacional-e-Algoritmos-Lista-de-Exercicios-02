import java.util.Scanner;

public class Escadas
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int n1;

	    
	    System.out.print("Digite a quantidade de niveis: ");
        n1 = input.nextInt();
        
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

	}
}
