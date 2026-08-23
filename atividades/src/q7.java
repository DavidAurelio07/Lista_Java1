import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] temperaturas = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + (i + 1) + ": ");
            temperaturas[i] = input.nextDouble();
        }

        double maior = temperaturas[0];
        double menor = temperaturas[0];

        int mesMaior = 0;
        int mesMenor = 0;

        for (int i = 1; i < 12; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
                mesMaior = i;
            }

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
                mesMenor = i;
            }
        }

        String[] meses = {"janeiro", "fevereiro", "março", "abril","maio", "junho", "julho", "agosto",
                "setembro", "outubro", "novembro", "dezembro" };

        System.out.println("Maior temperatura: " + maior + "°C");
        System.out.println("Mês: " + meses[mesMaior]);

        System.out.println("Menor temperatura: " + menor + "°C");
        System.out.println("Mês: " + meses[mesMenor]);
    }
}