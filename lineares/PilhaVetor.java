package lineares;

public class PilhaVetor<T> implements Pilha<T> {
    private T[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite){
        this.info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < this.tamanho; i++) {
            str += info[i] + ", ";
        }
        return str + "]";
    }

    @Override
    public void push(T v) {
        if (limite == tamanho) {
            throw new IndexOutOfBoundsException("Encheu");
        }
        info[tamanho] = v;
        tamanho++;
    }

    @Override
    public T pop() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        T v = peek();
        info[tamanho - 1] = null;
        tamanho --;
        return v;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia");
        }
        return info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return (tamanho == 0);
    }

    @Override
    public void liberar() {
        this.info = (T[]) new Object[limite];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }
    
    public int compara(Pilha<T> p2) {
        int comp = 0;
        while ((this.tamanho != 0) || (p2.getTamanho() != 0)) {
            T v1;
            T v2;
            v1 = this.peek();
            v2 = p2.peek();

            if (v1 == v2) {
                this.pop();
                p2.pop();
            } else {
                this.pop();
                p2.pop();
                comp++;
            }
        }

        if (this.tamanho == 0) {
            comp = 0;
            while(p2.getTamanho() != 0) {
                p2.pop();
                comp--;
            }
        } else {
            comp = 0;
            while (this.tamanho != 0) {
                this.pop();
                comp++;
            }
        }
        return comp;
    }

    // public String teste() {
        
    //     String test = "";

    //     test = this.toString();

    //     test.replace("[", " ");
    //     test.replace(",", " ");
    //     test.replace("]", " ");
        
    //     return test;
    // }
    
}
