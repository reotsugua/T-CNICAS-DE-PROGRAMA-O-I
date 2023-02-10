package ExAula04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Produto("refrigerente", 5.90));
        listaProdutos.add(new Produto("agua", 1.99));
        listaProdutos.add(new Produto("salgadinho", 8.55));


        /*Function<List<Produto>, Double> corpoDoMetodo = (produtos) ->{
            Double sum = 0.0;
            for (Produto produto: produtos
            ) {
                sum += produto.getPreco();
            }
            return sum;
        };
        Double precosTotal = calcular(listaProdutos, corpoDoMetodo);*/


        Double precosTotal = calcular(listaProdutos, (produtos) ->{
            Double sum = 0.0;
            for (Produto produto: produtos
                 ) {
                sum += produto.getPreco();
            }
            return sum;
        });
        System.out.println("precosTotal = " + precosTotal);

    }

    private static Double calcular(List<Produto> produtos, Function<List<Produto>, Double> corpoDoMetodo) {
        return corpoDoMetodo.apply(produtos);
    }


}
