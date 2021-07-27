package testes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import classes.Produto;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Queue<Produto> filaComPrioridade = new PriorityQueue<Produto>(new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                return Float.valueOf(p2.getPreco()).compareTo(p1.getPreco());
            }

        });

        List<Produto> joias = new ArrayList<>();

        Produto joia1 = new Produto(1, "Brinco", 1020, 4);
        Produto joia2 = new Produto(2, "Pulseira", 4220, 3);
        Produto joia3 = new Produto(3, "Corrente", 2538, 6);
        Produto joia4 = new Produto(4, "Anel", 845, 8);

        joias.add(joia1);
        joias.add(joia2);
        joias.add(joia3);
        joias.add(joia4);

        for (int i = 0; i < joias.size() ; i++) {            
            filaComPrioridade.offer(joias.get(i));
        }

        System.out.println("Fila sem prioridade: ");
        for (int i = 0; i < joias.size(); i++) {
            System.out.println(joias.get(i));
        }

        System.out.println("Fila com prioridade no preço: ");
        while (!filaComPrioridade.isEmpty()) {
            System.out.println(filaComPrioridade.poll());
        }
    }
    
}