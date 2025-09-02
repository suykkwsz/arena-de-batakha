//Vilão também É UM personagem.
public class Vilao extends Personagem {
    //Atributos especpifico do vilão
    private String tipoDeAtaque;

    public Vilao(String nome, int pontosDeVida, int forca, String tipoDeAtaque) {
        super(nome, pontosDeVida, forca);
        this.tipoDeAtaque = tipoDeAtaque;
    }

    //Sobrescrevendo o ataque para dar uma mensagem customizada


    @Override
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " usa " + this.tipoDeAtaque + " em " + alvo.nome + "!");
        alvo.receberDano(this.forca);
    }
}
