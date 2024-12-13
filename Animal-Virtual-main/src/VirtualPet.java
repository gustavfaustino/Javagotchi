import java.util.Scanner;

class VirtualPet {
    Scanner sc = new Scanner(System.in);

    String nome;
    int nivelDeFome = 50;
    int nivelFelicidade = 50;
    int cansaco = 0;
    int idade = 0;
    int medidorBanheiro = 0;
    int medidorSujeira = 0;

    public int getMedidorSujeira() {
        return medidorSujeira;
    }

    public void setMedidorSujeira(int medidorSujeira) {
        this.medidorSujeira = medidorSujeira;
    }

    public int getMedidorBanheiro() {
        return medidorBanheiro;
    }

    public void setMedidorBanheiro(int medidorBanheiro) {
        this.medidorBanheiro = medidorBanheiro;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public VirtualPet(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        if (nivelDeFome >= 100){
            System.out.println(nome + " morreu de fome. Você perdeu");
        } else {
            nivelDeFome -= 10;
            System.out.println(nome + " foi alimentado. O nível de fome diminuiu.");
        }

        if (medidorBanheiro >= 100){
            System.out.println(nome + " morreu de infecção de urina.");
        } else {
            medidorBanheiro++;
            System.out.println(nome + " está ficando com mais vontade de ir ao banheiro");
        }
    }

    public void descansar(){
        System.out.println("Quanto tempo o Pet descansará? (1-8 horas)");
        int choice = sc.nextInt();

        if (cansaco <= 0){
            System.out.println(nome + " não precisa descansar, ele já está 100%");
            cansaco = 0;
        } else {
            for (int i = 0; i < choice; i++) {
                cansaco -= 12;
            }
            System.out.println(nome + " descansou. O nível de cansaço diminuiu: " + cansaco);
        }

    }

    public int getCansaco() {
        return cansaco;
    }

    public void setCansaco(int cansaco) {
        this.cansaco = cansaco;
    }

    public void brincar() {
        if (cansaco >= 100){
            System.out.println(nome + " morreu de fome. Você perdeu");
        } else {
            cansaco += 5;
            System.out.println(nome + " o nível de cansaço subiu para " + cansaco);
        }
        nivelFelicidade += 10;
        System.out.println(nome + " está brincando e se sentindo mais feliz.");

        if (medidorSujeira >= 100){
            System.out.println(nome + " morreu de sujeira. Você perdeu");
        } else {
            medidorSujeira += 5;
            System.out.println(nome + " está ficando mais sujo");
        }

    }

    public void verificarStatus() {
        System.out.println("Status atual de " + nome + ":");
        System.out.println("Nível de fome: " + nivelDeFome);
        System.out.println("Nível de felicidade: " + nivelFelicidade);
        System.out.println("Idade: " + idade);
    }

    public void passarTempo() {
        if (nivelDeFome >= 100){
            System.out.println(nome + " morreu de fome. Você perdeu");
        } else {
            nivelDeFome -= 3;
            System.out.println(nome + " está ficando mais faminto com o passar do tempo.");
        }

        if (idade >= 50){
            System.out.println(nome + " chegou a idade 50, parabéns");
        } else {
            idade++;
            System.out.println(nome + " o tempo passou, e sua idade aumantou: " + idade);
        }
        if (nivelFelicidade <= 0){
            System.out.println(nome + " morreu de depressão. Você perdeu");
        } else {
            nivelFelicidade -= 3;
            System.out.println(nome + " está ficando mais faminto com o passar do tempo."); //AQ
        }

        cansaco += 10;

    }
}
