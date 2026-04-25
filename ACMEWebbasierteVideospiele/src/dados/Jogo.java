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

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorMin() {
        return this.valorMin;
    }

    public void setValorMin(double valorMin) {
        this.valorMin = valorMin;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

}