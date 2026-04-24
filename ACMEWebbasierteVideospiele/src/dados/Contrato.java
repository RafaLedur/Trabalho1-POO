package dados;
public class Contrato{
    private int id;
    private int periodo;
    Cliente cliente;
    Jogo jogo;


    public Contrato(int id, int periodo, Cliente cliente, Jogo jogo) {
        this.id = id;
        this.periodo = periodo;
        this.cliente = cliente;
        this.jogo = jogo;
    }
    
}