package dados;
public class Jogo{
    private int codigo;
    private String nome;
    private int ano;
    private double valorMin; 
    private Categoria categoria;

    public Jogo(int codigo, String nome, int ano, double valorMin, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.ano = ano;
        this.valorMin = valorMin;
        this.categoria = categoria;
    }

}