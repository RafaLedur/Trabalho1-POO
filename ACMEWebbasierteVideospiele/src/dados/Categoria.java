package dados;

public enum Categoria{
    AVENTURA("AVENTURA"),
    ESTRATEGIA("ESTRATEGIA"),
    CORRIDA("CORRIDA");

    private final String cat;

    Categoria(String cat){
        this.cat = cat;
    }
    public String getCategoria(){
        return cat;
    }
}