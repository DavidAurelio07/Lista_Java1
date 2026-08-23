import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] gabarito = new int[8];


        System.out.println("Digite o gabarito das 8 questões: ");
        for (int i = 0; i < 8; i++) {
            gabarito[i] = input.nextInt();
        }

        int aprovados = 0;


        for (int aluno = 0; aluno < 10; aluno++) {

            System.out.print("Digite o número do aluno: ");
            int numero = input.nextInt();

            int nota = 0;

            System.out.println("Digite as respostas do aluno: ");

            for (int questao = 0; questao < 8; questao++) {
                int resposta = input.nextInt();

                if (resposta == gabarito[questao]) {
                    nota++;
                }
            }

            System.out.println("Aluno: " + numero);
            System.out.println("Nota: " + nota);

            if (nota >= 6) {
                aprovados++;
            }
        }

        double porcentagem = (aprovados * 100.0) / 10;

        System.out.println("Porcentagem de aprovação: " + porcentagem + "%");
    }
}