public class Bebida extends Produto{

    private int quantidadeEstoque;

    @Override
    public void mostrarDados() {
        System.out.println("\n Produto"+ getDescricao() +
                "\n quantidade em Estoque:" + quantidadeEstoque
                + "\n Preco:" + getPreco());
    }

    public Bebida(String descricao, double preco, int quantidadeEstoque) {
        super(descricao, preco);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Bebida(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Bebida(String descricao, double preco) {
        super(descricao, preco);
    }


}
