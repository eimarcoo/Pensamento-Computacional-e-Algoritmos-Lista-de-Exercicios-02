import java.util.Scanner;

public class CategoriaCNH
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int rodas;
		int pessoas;
		float peso;
		
		System.out.println("Digite a quantidade de rodas do veiculo: ");
        rodas = input.nextInt();
        
        System.out.println("Digite o peso do veiculo em kg: ");
        peso = input.nextFloat();
        
        System.out.println("Digite a quantidade de pessoa no veiculo: ");
        pessoas = input.nextInt();
		
		if (rodas >= 2 && rodas <= 3 && peso != 0) {
		    System.out.println("Categoria A");
		} else if (rodas == 4 && pessoas <= 8 && peso <= 3500){
		    System.out.println("Categoria B");
		} else if (rodas >= 4 && peso >= 3500 && peso <= 6000){
		    System.out.println("Categoria C");
		} else if (rodas >= 4 && pessoas > 8 && peso != 0){
		    System.out.println("Categoria D");
		} else if (rodas >= 4 && pessoas != 0 && peso > 6000){
		    System.out.println("Categoria E");
		} else{
		    System.out.println("Informações incorretas");
		}
		
	}
}
