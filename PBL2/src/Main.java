public class Main {
    public static void main(String[] args) {
        TV minhaLG = new TV();
        minhaLG.ligar();
        minhaLG.desligar();
        minhaLG.conectaratomada();
        minhaLG.mutar();
        minhaLG.informacao();
        Carro meucarro = new Carro();
        meucarro.Atributos_Padrao();
        System.out.println(meucarro.ano);
        meucarro.ligar();
        meucarro.desligar();
        meucarro.abastecer();
        meucarro.rodar();
    }
}
