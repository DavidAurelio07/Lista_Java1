import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String sexo;
        int olhos,cabelos;
        int idade = 0, maior = 0 , menor=100, quantidade=0;




        while (true){
            System.out.println("Digite a idade: ");
            idade = input.nextInt();
            if (idade == -1){
                break;
            }

            if (idade > maior){
                maior = idade;
            }

            if (idade <menor){
                menor = idade;
            }
            System.out.println("Digite o sexo: F/M");
            sexo  = input.next();

            System.out.println("Cor dos olhos: 1- Azul  2- Verde  3- Castanho: ");
            olhos = input.nextInt();

            System.out.println("Cor do cabelo: 1- Loiro  2- Castanho  3- Preto");
            cabelos = input.nextInt();

            if ((idade >=18 && idade <= 35) && ( olhos == 2 && cabelos ==1) && sexo.equals("F")){
                quantidade++;
            }
        }
        System.out.println("Maior Idade: "+maior);
        System.out.println("Menor Idade: "+menor);
        System.out.println("Quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos inclusive\n" +
                "e que tenham olhos verdes e cabelos louros: "+quantidade);




    }
}