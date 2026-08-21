import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Digite o número de alunos matriculados: ");
        n = input.nextInt();

        int[] pm = new int[n];
        int[] ca = new int[n];


        for(int i =0; i < pm.length;i++){
            System.out.println("Digite as matrículas  dos alunos de Programação Modular: ");
            pm[i] = input.nextInt();
        }

        for(int i =0; i < pm.length;i++){
            System.out.println("Digite as matriculas  dos alunos de Cálculo: ");
            ca[i] = input.nextInt();
        }

        for (int i = 0; i < pm.length;i++){
            for(int j = 0; j < ca.length; j++){
                if (pm[i] == ca[j]){
                    System.out.println(pm[i]);
                }
            }
        }
    }
}