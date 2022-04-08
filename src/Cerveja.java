public class Cerveja extends  Bebida{

    private double teorAlcoolico;

    public void mostrarDados() {
        System.out.println("\n Produto"+ getDescricao()
                +"\n Teor Alccoolico:" + getTeorAlcoolico()
                + "\n Preço:" + getPreco());
    }

    public Cerveja(String descricao, double preco, int quantidadeEstoque, double teorAlcoolico) {
        super(descricao, preco, quantidadeEstoque);
    }

    public Cerveja(int quantidadeEstoque) {
        super(quantidadeEstoque);
    }

    public Cerveja(String descricao, double preco) {
        super(descricao, preco);
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }
}
