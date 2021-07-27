package testes;
import classes.Fila;
public class Exercicio6 {
    public static void main(String[] args) {

        Fila<Object> fila = new Fila<Object>(7);
        
        fila.enfileirar(4);
        fila.enfileirar(54);
        fila.enfileirar(766);
        fila.enfileirar(23);
        fila.enfileirar(98);
        fila.enfileirar(65);

        System.out.println("Fila normal: " + fila.toString());
        fila.inverterFila();
        System.out.println("Fila invertida: " + fila.toString());
    }
}