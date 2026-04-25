package dados;

public enum Categoria{
    AVENTURA("AVENTURA"),
    ESTRATEGIA("ESTRATEGIA"),
    CORRIDA("CORRIDA");

    private String cat;

    private Categoria(String cat){
        this.cat = cat;
    }
    
}