public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public void Atributos_Padrao(){
        this.marca="renault";
        this.modelo="sandero";
        this.ano=2021;
        this.cor="preto";
    }
    public void ligar(){
        System.out.println("Carro ligado");
    }
    public void rodar(){
        System.out.println("Carro rodando");
    }
    public void desligar(){
        System.out.println("Carro desligado");
    }
    public void abastecer(){
        System.out.println("Carro abastecido");
    }
}
