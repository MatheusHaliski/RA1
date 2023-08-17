
import classes.src.Pessoa;
import classes.src.Pessoa_Desc;
import classes.src.Teste;

import java.util.Scanner;
public class Main{
    int size;
    int[] vetor;
    public static void main(String[] args){
        Pessoa_Desc joaoFreitas = new Pessoa_Desc();
        Pessoa_Desc marina = new Pessoa_Desc();
        Teste algoritmo = new Teste();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] vetor=algoritmo.criarVetor(size);
        for (int i=0;i<size;i++){
            System.out.println(vetor[i]);
        }
        joaoFreitas.nome="JoaoFreitas";
        joaoFreitas.matricula="84657893";
        joaoFreitas.curso="SI";
        joaoFreitas.idade=21;
        joaoFreitas.periodo=2;

        marina.nome="Marina";
        marina.matricula="84645581";
        marina.curso="SI";
        marina.idade=31;
        marina.periodo=10;

        joaoFreitas.imprimirInformacao(2,"sanduiche");
        joaoFreitas.estudar("programação");
        joaoFreitas.comer(2,"parmegiana");
        joaoFreitas.Jogar("xadrez");
        joaoFreitas.encheroSacodaProfessora();

        marina.imprimirInformacao(2,"sanduiche");
        marina.estudar("matematica");
        marina.comer(2,"sanduiche");
        marina.Jogar("videogame");
        marina.encheroSacodaProfessora();
    }
}

