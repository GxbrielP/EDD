package lineares;

public class PilhaLista<T> implements Pilha<T>{
    private  ListaEncadeada<T> lista;

public PilhaLista() {
    lista = new ListaEncadeada<>();
}

    @Override
    public void push(T v) {
        lista.inserir(v);
    }

    @Override
    public T pop() {
        if (estaVazia()) {
            throw new RuntimeException("Está vazia");
        }
        T v = lista.pegar(lista.getTamanho() - 1);
        lista.retirar(v);
        return v;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        return lista.pegar(lista.getTamanho() - 1);
    }

    @Override
    public boolean estaVazia() {
        return (lista.estaVazia());
    }

    @Override
    public void liberar() {
        lista = new ListaEncadeada<>();
    }

    public String toString() {
        return lista.exibir();
    }

    public int getTamanho() {
        return lista.getTamanho();
    }
}
