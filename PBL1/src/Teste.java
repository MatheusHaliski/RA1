package classes.src;

import java.util.Scanner;
import java.util.Random;
public class Teste {

    public static int[] criarVetor(int size) {
        int[] vetor = new int[size];
        //declaração do meu contador 1
        //condição de execução
        //incremento do contador
        for (int i=0;i<size;i++){
            Random random = new Random();
            vetor[i]= random.nextInt(99);

        }
        return vetor;
    }
    //Fora da função, dentro da classe PODE variavel
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite tamanho da lista");
        int size = scanner.nextInt();
        int[] vetor=criarVetor(size);
        for (int i=0; i<size;i++){
            if (vetor[i]%3==0){
                System.out.println(vetor[i]+"- Multiplo de 3!");
            }
            else if (vetor[i]%2==0){
                System.out.println(vetor[i]+"- Par");
            }
            else{
                System.out.println(vetor[i]+"- Impar");
            }
        }
    }
}
