import java.util.ArrayList;

public class PasseioBalao {
    private Piloto piloto;
    private Balao balao;
    private int duracao;
    private double valor;
    private ArrayList<Pessoa> passageiros;


    public PasseioBalao(Piloto piloto, Balao balao, int duracao, double valor) {
        this.piloto = piloto;
        this.balao = balao;
        this.duracao = duracao;
        this.valor = valor;
        this.passageiros = new ArrayList<>();
    }


    public void adicionarPassageiro(Pessoa passageiro) {
        if (passageiros.size() < 4) {
            passageiros.add(passageiro);
        } else {
            System.out.println("O limite de passageiros para este passeio já foi atingido.");
        }
    }


    public void listarPassageiros() {
        for (Pessoa passageiro : passageiros) {
            System.out.println("Nome: " + passageiro.getNome() + ", CPF: " + passageiro.getCpf());
        }
    }
}