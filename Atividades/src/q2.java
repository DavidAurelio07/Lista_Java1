import java.util.Scanner;

public class q2{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valores = new int[3];

        System.out.println("Digite o valor de x: ");
        valores[0] = input.nextInt();

        System.out.println("Digite o valor de y: ");
        valores[1] = input.nextInt();

        System.out.println("Digite o valor de z: ");
        valores[2] = input.nextInt();

        int maior= valores[0], menor = valores[0];

        for (int i = 0; i<3; i++){
            if (valores[i] > maior){
                maior = valores[i];
            }

            if (valores[i] < menor){
                menor = valores[i];
            }
        }

        System.out.println("Maior valor: "+maior);
        System.out.println("Menor valor: "+menor);

        if (valores[0] >= valores[1] && valores[0] <= valores[2]){
            System.out.println("O X está dentro do intervalor de y,z");
        }else{
            System.out.println("O x está fora do intervalo de y,z");
        }

        if (valores[0] % valores[1] == 0){
            System.out.println("O número "+valores[0]+" é divisivel por "+valores[1]);

        }else{
            System.out.println("Não é divisivel pelo "+valores[1]);
        }
        if (valores[0] % valores[2] == 0){
            System.out.println("O número "+valores[0]+" é divisivel por "+valores[2]);
        }else{
            System.out.println("Não é divisivel pelo "+valores[2]);
        }
    }

}