public class ArenaDeBatalha {
    public static void main(String[] args) {
        //1. Criação dos personagens
        Heroi Luffy = new Heroi("Luffy", 100, 15);
        Vilao orc = new Vilao("Orc Grunt", 80, 10, "Golpe de Clava");

        System.out.println("--- A BATALHA COMEÇA! ---");
        Luffy.exibirStatus();
        orc.exibirStatus();
        System.out.println("---------------------------------\n");

        int turno = 1;

        //2. Loop da batalha
        //A batalha continua enquanto ambos (herói e vilão) estiverem vivos.
        while (Luffy.estaVivo() && orc.estaVivo()) {
            System.out.println("--- TURNO " + turno + " ---");

            //Herói ataca o vilão
            Luffy.atacar(orc);

            //Verificar se o monstro sobreviveu antes de atacar de volta
            if (orc.estaVivo()) {
                orc.atacar(Luffy);

                //Exemplo de uso da habilidade especial do herói (lógica simples)
                //Se a vida do herói ficar baixa, ele tenta usar uma poção
                if(Luffy.estaVivo() && Luffy.pontosDeVida < 40) {
                    System.out.println("\nVida do herói está baixa! ");
                    Luffy.usarPocao();
                }
                System.out.println("--------------------------------\n");
                turno++;
            }

            //3. FIM DA BATALHA
            System.out.println("--- A BATALHA TERMINOU! ---");
            if(Luffy.estaVivo()) {
                System.out.println(Luffy.nome + " é o vencedor!!!");
            }else {
                System.out.println(orc.nome + " é o vencedor!!!");
            }
            Luffy.exibirStatus();
            orc.exibirStatus();
        }
    }
}
