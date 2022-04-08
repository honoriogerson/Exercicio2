public class Pizza extends Produto{

    private boolean bordaRecheada;
    private Ingrediente ingrediente;


    @Override
    public void mostrarDados() {
        System.out.println("\n Produto" + getDescricao()
                + "\n Borda Recheada:" + bordaRecheada
                + "\n Ingrediente:" + ingrediente
                + "\n Preço:" + getPreco() );
    }

    public Pizza(String descricao, double preco, boolean bordaRecheada, Ingrediente ingrediente) {
        super(descricao, preco);
        this.bordaRecheada = bordaRecheada;
        this.ingrediente = ingrediente;
    }

    public Pizza(boolean bordaRecheada, Ingrediente ingrediente) {
        this.bordaRecheada = bordaRecheada;
        this.ingrediente = ingrediente;
    }

    public Pizza(String descricao, double preco) {
        super(descricao, preco);
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
}
