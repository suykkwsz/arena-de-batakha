//Heroi É UM personagem. Herda todos os atributos e métodos de personagens.
public class Heroi extends Personagem{
    //Atributo específico do heroi
    private int pocoesDeCura;

    public Heroi(String nome, int pontosDeVida, int forca) {
        //Chama o construtor de personagem para configurar os atributos herdados
        super(nome, pontosDeVida, forca);
        this.pocoesDeCura = 2; // O herói sempre começa com 2 poções
    }

    //Metodo específico do herói
    public void usarPocao() {
        if (pocoesDeCura > 0) {
            this.pontosDeVida += 20; //A poção cura 20 de vida.
            this.pocoesDeCura--;
            System.out.println(this.nome + " usou uma poção de cura! Vida atual: " + this.pontosDeVida);
            System.out.println("Poções restantes: " + this.pocoesDeCura);
        }else{
            System.out.println(this.nome + " não tem mais poções de cura!");
        }
    }
}
