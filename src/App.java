import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();            // usa nextDouble

        System.out.print("Digite o valor dos benefícios: ");
        double salarioBeneficios = sc.nextDouble();       // usa double

        double imposto;

        if (salarioBruto >= 0 && salarioBruto <= 1100) {
            imposto = salarioBruto * 0.05;
        } else if (salarioBruto > 1100 && salarioBruto <= 2500) {
            imposto = salarioBruto * 0.10;
        } else {
            System.out.println("Salário inválido");
            sc.close();
            return;
        }

        double salarioFinal = salarioBruto - imposto + salarioBeneficios;

        // imprime com 2 casas decimais
        System.out.printf("Imposto de Renda: %.2f | Benefícios: %.2f | Salário final: %.2f%n",
                           imposto, salarioBeneficios, salarioFinal);

        sc.close();
    }
}
