public class TV{
    public String marca;
    public int tamanho;
    public int ano;
    public String resolucao;
    public TV(){
        this.marca="LG";
        this.tamanho=40;
        this.ano=2022;
        this.resolucao="5K";
    }
    public void ligar(){
        System.out.println("TV Ligada");
    }
    public void desligar(){
        System.out.println("TV Desligada");
    }
    public void conectaratomada(){
        System.out.println("TV conectada");
    }
    public void mutar(){
        System.out.println("TV silenciada");
    }
    public void informacao(){
        System.out.println(marca);
        System.out.println(tamanho);
        System.out.println(ano);
        System.out.println(resolucao);
    }
}
