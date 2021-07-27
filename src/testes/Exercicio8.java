package testes;
import java.util.Stack;
import classes.Fibonacci;

public class Exercicio8 {
    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();
        Fibonacci fibo = new Fibonacci();

        for (int i = 0; i < 10; i++) {
            pilha.push(fibo.fibonacci(i));
        }

        System.out.println(pilha.toString());
    }
}