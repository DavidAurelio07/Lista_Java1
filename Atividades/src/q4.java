import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho de X: ");
        int n = input.nextInt();

        System.out.print("Digite o tamanho de Y: ");
        int m = input.nextInt();

        int[] X = new int[n];
        int[] Y = new int[m];
        int[] Z = new int[n + m];

        System.out.println("Digite os elementos de X:");
        for (int i = 0; i < n; i++) {
            X[i] = input.nextInt();
        }

        System.out.println("Digite os elementos de Y:");
        for (int i = 0; i < m; i++) {
            Y[i] = input.nextInt();
        }

        int tamanhoZ = 0;


        for (int i = 0; i < n; i++) {
            Z[tamanhoZ] = X[i];
            tamanhoZ++;
        }


        for (int i = 0; i < m; i++) {
            boolean existe = false;

            for (int j = 0; j < tamanhoZ; j++) {
                if (Y[i] == Z[j]) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                Z[tamanhoZ] = Y[i];
                tamanhoZ++;
            }
        }


        System.out.println("Vetor união Z:");
        for (int i = 0; i < tamanhoZ; i++) {
            System.out.print(Z[i] + " ");
        }
    }
}
