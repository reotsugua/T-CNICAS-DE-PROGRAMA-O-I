package Aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streeams {
    public static void main(String[] args) {
        List<Integer> ListadeInteiro = List.of(1,2,3,4,5);
        List<Integer> novalista = calcular(ListadeInteiro);
        System.out.println("novalista = " + novalista);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

    }


    private static Stream<Integer> calcularStream(Stream<Integer> listadeInteiro) {
        List<Integer> novaLista = new ArrayList<>();
        for (Integer numero : listadeInteiro) {
            novaLista.add(numero*2);
        }
        return novaLista;
    }

    //Método antigo c/ Lista
    private static List<Integer> calcular(List<Integer> listadeInteiro) {
        List<Integer> novaLista = new ArrayList<>();
        for (Integer numero : listadeInteiro) {
            novaLista.add(numero*2);
        }
        return novaLista;
    }


}
