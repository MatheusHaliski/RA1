/* GRUPO 6 : MATHEUS HALISKI E VICTOR LUIS */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Exemplo {
    public static void main(String[] args) {
        CriarLista();
    }

    public static void CriarLista() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o comprimento da lista:");
        int comprimento_lista = scanner.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < comprimento_lista; i++) {
            int numeroaleatorio = random.nextInt(10);
            lista.add(numeroaleatorio);

            if (numeroaleatorio==0){
                System.out.println("Zero!");
            }
            else if (numeroaleatorio % 3 == 0 && numeroaleatorio != 0) {
                System.out.println(numeroaleatorio + " - O número é múltiplo de 3!");
            } else if (numeroaleatorio % 2 == 0 && numeroaleatorio != 0) {
                System.out.println(numeroaleatorio + " - O número é par!");
            } else {
                System.out.println(numeroaleatorio + " - O número é ímpar!");
            }
        }
    }
}
