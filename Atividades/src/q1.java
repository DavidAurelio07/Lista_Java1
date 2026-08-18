import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Digite um número: ");
        n = input.nextInt();
        int fatorial = n;

        for (int i = 1; i < n ;i++){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
}
