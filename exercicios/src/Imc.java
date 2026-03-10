import java.util.Scanner;
import java.util.Locale;
public class Imc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 16) {
            System.out.printf("%s, seu IMC é de %.2f e você está com desnutrição grave. Procure um médico!!", nome, imc);
        } else if (imc < 18.5) {
            System.out.printf("%s, você está abaixo do peso!!", nome, imc);
        } else if (imc < 25) {
            System.out.printf("%s, seu IMC é de %.2f e você está com um indice de massa corporal normal.", nome, imc);
        } else if (imc < 30) {
            System.out.printf("%s, seu IMC é de %.2f e você está com sobrepeso, tome cuidado!!", nome, imc);
        } else if (imc < 35) {
            System.out.printf("%s, seu IMC é de %.2f e você está com obesidade nível 1, procure um médico!!", nome, imc);
        } else if (imc < 40) {
            System.out.printf("%s, seu IMC é de %.2f e você está com obesidade nível 2, procure um médico!!", nome, imc);
        } else {
            System.out.printf("%s, seu IMC é de %.2f e você está com obesidade nível 3, procure um médico rápido!!", nome, imc);
        }
        sc.close();
    }
}
