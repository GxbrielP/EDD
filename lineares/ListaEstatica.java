package lineares;

public class ListaEstatica<T> implements Lista<T>{
    private T[] info;
    private int tamanho = 0;

    public ListaEstatica() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public  boolean estaVazia() {
        return (tamanho == 0);
    }

    private void redimensionar() {
        T[] novo = (T[]) new Object[info.length + 10];
        for (int i = 0; i < info.length; i++) {
			novo[i] = info[i];
		}
		this.info = novo;
    }

    @Override
    public int buscar(T valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public T pegar(int pos) {
        if (pos < 0 || pos >= this.tamanho) {
            throw new IndexOutOfBoundsException("Pos=" + pos + ". Length=" + tamanho);
        }
        return this.info[pos];
    }

    @Override
    public Lista<T> copiar() {
        Lista<T> outra = new ListaEstatica<>();

        for (int i = 0; i < this.tamanho; i++) {
            outra.inserir(this.info[i]);
        }
        return outra;
    }

    @Override
    public Lista<T> dividir() {
        int metade = this.tamanho / 2;
        Lista<T> outra = new ListaEstatica<>();

        for (int i = metade; i < this.tamanho; i++) {
            outra.inserir(this.info[i]);
        }
        this.tamanho = metade;
        return outra;
    }

    @Override
    public void concatenar(Lista<T> outraLista) {
        for (int i = 0; i < outraLista.getTamanho(); i++) {
            this.inserir(outraLista.pegar(i));
        }
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == info.length) {
            this.redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    @Override
    public void inserir(T valor, int pos) {
        if (pos < 0 || pos >= this.tamanho) {
            throw new IndexOutOfBoundsException("Pos=" + pos + ". Length=" + tamanho);
        }
        if (tamanho == info.length) {
            this.redimensionar();
        }
        if (pos == tamanho) {
            this.inserir(valor);
        } else {
            for (int i = tamanho; i > pos; i--) {
				info[i] = info[i - 1];
			}
            info[pos] = valor;
            tamanho ++;
        }
    }

    @Override
    public void retirar(T valor) {
        int pos = this.buscar(valor);
        if (pos != -1) {
            for (int i = pos; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    @Override
    public String exibir() {
        String str = "[";
        for (int i = 0; i < this.tamanho; i ++) {
            str += info[i] + ", ";
        }
        return str + "]";
    }
}
