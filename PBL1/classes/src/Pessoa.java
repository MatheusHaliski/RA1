package classes.src;
public class Pessoa {
        //Atributos do objeto pessoa
        public String nome;
        public String matricula;
    public String curso;
    public int idade;
    public int periodo;

    public void estudar(String conteudo) {
            System.out.println("O" + nome + "está estudando");
        }

    public void comer(int nBloco, String comida) {
            System.out.println("O " + nome + " está comendo " + comida + " no bloco 2");
        }

    public void Jogar(String nomeJogo) {
            System.out.println("O" + nome + "está jogando o jogo na sala");
        }
    public void encheroSacodaProfessora() {
            System.out.println("O " + nome + " está...");
        }

    public void imprimirInformacao(int nBloco, String comida) {
            System.out.println("Nome" + nome);
            System.out.println("Idade" + idade);
            System.out.println("Periodo" + periodo);
            System.out.println("Matricula" + matricula);
            System.out.println("Comendo no bloco " + nBloco + " um " + comida);
        }
}
