package dados;

public class Corporativo extends Cliente{
    private String cnpj;
    private String nomefantasia;

    public Corporativo(int numero, String nome, String email, String cnpj, String nomeF){
        super(numero, nome, email);
        this.cnpj = cnpj;
        nomefantasia = nomeF;
    }
}