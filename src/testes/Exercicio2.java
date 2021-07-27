package testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        
        lista.add(7);
        lista.add(3);
        lista.add(54);
        lista.add(93);
        lista.add(76);
        lista.add(11);
        lista.add(5);
        lista.add(3);
        int xMaior = 5;

        System.out.println("Números pares: " + valoresPares(lista));
        System.out.println("Maior valor: " + maiorValor(lista));
        System.out.println("Menor valor: " + menorValor(lista));
        System.out.println("Posição do maior: " + posicaoMaior(lista));
        System.out.println("Posição do menor: " + posicaoMenor(lista));
        System.out.println("Valores maiores que do x.: "
                + valorMaior(lista, xMaior));
        System.out.println("A soma da lista: " + somaLista(lista));
    }

    public static int valoresPares(List<Integer> list) {
        int qtdPares = 0;
        int valor = 0;
        for (int i = 0; i < list.size(); i++) {
            valor = list.get(i);
            if (valor % 2 == 0) {
                qtdPares++;
            }
        }
        return qtdPares;
    }

    public static int maiorValor(List<Integer> list) {
        int maiorValor = 0;
        maiorValor = Collections.max(list);
        return maiorValor;
    }

    public static int menorValor(List<Integer> list) {
        int menorValor = 0;
        menorValor = Collections.min(list);
        return menorValor;
    }

    public static int posicaoMaior(List<Integer> list) {
        int posicaoMaior = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == maiorValor(list)) {
                posicaoMaior = i;
            }
        }
        return posicaoMaior;
    }

    public static int posicaoMenor(List<Integer> list) {
        int posicaoMenor = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == menorValor(list)) {
                posicaoMenor = i;
            }
        }
        return posicaoMenor;
    }

    public static int valorMaior(List<Integer> list, int xMaior) {
        int valorMaior = 0;
        for (int i = 0; i < list.size(); i++) {
            if (xMaior < list.get(i)) {
                valorMaior++;
            }
        }
        return valorMaior;
    }

    public static int somaLista(List<Integer> list) {
        int valorSoma = 0;

        for (int i = 0; i < list.size(); i++) {
            valorSoma = valorSoma + list.get(i);
        }
        return valorSoma;
    }
}