package dados;

public enum Categoria{
    AVENTURA("AVENTURA"),
    ESTRATEGIA("ESTRATEGIA"),
    CORRIDA("CORRIDA");

    private String dia;

    private Categoria(String dia){
        this.dia = dia;
    }
    
}