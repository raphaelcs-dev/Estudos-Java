import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int calculo;

        System.out.println("CALCULO ALISTAMENTO");
        System.out.println("-----------------------");
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o ano do seu nascimento: ");
        int ano = sc.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAt = sc.nextInt();

        int idade = anoAt - ano;


        if (idade == 18){
            System.out.println(nome + "você tem que se alistar este ano");
        }
        else if (idade > 18) {
            calculo = idade -  18;
            System.out.println(nome + " você já deveria ter se alistado há " + calculo + " anos atrás");
        }
        else {
            calculo = Math.abs(18 - idade);
            System.out.printf("%s Faltam %d anos para o seu alistamento!!", nome, calculo);
        }
    }
}