package lineares;

public interface Pilha<T> {

    void push(T v);
    T pop ();
    T peek();
    boolean estaVazia();
    void liberar();

    // botei o getTamanho pra questão 3 dos exercícios de revisão
    // não foi
    int getTamanho();
}