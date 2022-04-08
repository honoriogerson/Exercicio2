import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Produto bebidaA = new Bebida("Suco de Laranja",12.90, 16);
        Produto bebidaB = new Bebida("Suco de Manga",11.50, 8);
        Produto bebidaC = new Bebida("Suco de Abacaxi",17.50, 3);

        Ingrediente ingredienteA = new Ingrediente("Queijo");
        Ingrediente ingredienteB = new Ingrediente("Molho de Tomate");
        Ingrediente ingredienteC = new Ingrediente("Oregano");


        Produto pMussarela = new Pizza("Mussarela", 39.50, false, ingredienteA);
        Produto pPresunto = new Pizza("Presunto", 29.50, true, ingredienteB);
        Produto pPortuguesa = new Pizza("Portuguesa", 49.50, true, ingredienteA);

        Bebida cervejaA = new Cerveja("Boos", 12.50, 17,17.2);
        Bebida cervejaB = new Cerveja("Big", 8.50, 7,14.3 );
        Bebida cervejaC = new Cerveja("Funk", 7.50, 70,8.2 );

        Bebida vinhoA = new Vinho("Fino", 96.00, 2, "Italiana", "Chile");
        Bebida vinhoB = new Vinho("Flamor", 196.00, 2, "Preta", "Africa");
        Bebida vinhoC = new Vinho("Onive", 960.00, 2, "Ruby", "Inglês");



      List<Produto> lista = new ArrayList<>();
      lista.add(bebidaA);
      lista.add(bebidaB);
      lista.add(pPortuguesa);
      lista.add(pPresunto);
      lista.add(vinhoC);
      lista.add(vinhoA);
      lista.add(vinhoB);
      lista.add(cervejaC);
      lista.add(cervejaB);
      lista.add(cervejaA);

      for (Produto p: lista){
          p.mostrarDados();
      }









    }
}
