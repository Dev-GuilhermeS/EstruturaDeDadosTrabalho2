package testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes.Produto;

public class Exercicio1 {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        Produto joia1 = new Produto(1, "Brinco", 1020, 4);
        Produto joia2 = new Produto(2, "Pulseira", 4220, 3);
        Produto joia3 = new Produto(3, "Corrente", 2538, 6);
        Produto joia4 = new Produto(4, "Anel", 845, 8);

        produtos.add(joia1);
        produtos.add(joia2);
        produtos.add(joia3);
        produtos.add(joia4);

        System.out.println("O menor valor é: " + menorPreco(produtos));
    }

    public static Float menorPreco(List<Produto> list) {        
        Float valor;
        Float menorValor;
        List<Float> valorMenor = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            valor = list.get(i).getPreco();
            valorMenor.add(valor);
        }
        menorValor = Collections.min(valorMenor);
        return menorValor;
    }

}