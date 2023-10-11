package TryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Aboutme {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Dgite seu sobrenome:");
        String sombrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Ola eu me chamo " + nome.toUpperCase() + " " + sombrenome);
        System.out.println("Sua idade e " + idade);
        System.out.println("sua altura e " + altura);
        }
        catch (InputMismatchException e){
            System.out.println("o campos idade e  altura precisam se numericos");
        }
    }
}
