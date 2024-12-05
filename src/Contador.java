import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        try{
            contar(numero1,numero2);
        } catch (ParamentrosInvalidosException e){
            System.out.println("O numero 2 tem que ser maior que o numero 1.");
        }
    }
    static void contar(int numero1, int numero2) throws ParamentrosInvalidosException {
        if (numero1>numero2){
           throw new ParamentrosInvalidosException();
        }
        int contagem = numero2 - numero1;
        System.out.println("A contagem deve ser de " + contagem);
        for(int i = 1; i<=contagem;i++ ){
            System.out.println(i);
        }
    }

}
