public class Vinho extends Bebida{

    private String uva;
    private String paisOrigem;

    public void mostrarDados() {
        System.out.println("\n Produto"+ getDescricao()
                +"\n Tipo de Uva:" + getUva()
                + "\n Pais de origem:" + getPaisOrigem()
                + "\n Preço:" + getPreco());
    }

    public Vinho(String descricao, double preco, int quantidadeEstoque, String uva, String paisOrigem) {
        super(descricao, preco, quantidadeEstoque);
    }

    public Vinho(int quantidadeEstoque) {
        super(quantidadeEstoque);
    }

    public Vinho(String descricao, double preco) {
        super(descricao, preco);
    }

    public String getUva() {
        return uva;
    }

    public void setUva(String uva) {
        this.uva = uva;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
}
