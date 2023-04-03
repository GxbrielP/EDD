package lineares;

public class ListaEncadeada<T> implements Lista<T> {

    private NoLista<T> primeiro;
	private NoLista<T> ultimo;
	private int qtdElementos;

    @Override
    public boolean estaVazia() {
        return (primeiro == null);
    }

    @Override
    public int buscar(T valor) {
        NoLista<T> p = primeiro;
        int cont = 0;
        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return cont;
            }
            p = p.getProximo();
            cont++;
        }
        return -1;
    }

    @Override
    public int getTamanho() {
        return this.qtdElementos;
    }

    @Override
    public T pegar(int pos) {
        if (pos < 0 || pos >= this.qtdElementos) {
			throw new IndexOutOfBoundsException("Pos=" + pos);
		}
        NoLista<T> p = primeiro;
        int posicao = 0;

        while (p != null) {
            if (posicao == pos) {
                return p.getInfo();
            }
            posicao++;
            p = p.getProximo();
        }
        return null;
    }

    @Override
    public Lista<T> copiar() {
        ListaEncadeada<T> novaLista = new ListaEncadeada<>();
		for (NoLista<T> no = this.primeiro; no != null; no = no.getProximo()) {
			novaLista.inserir(no.getInfo());
		}
		return novaLista;
    }

    @Override
    public Lista<T> dividir() {
        ListaEncadeada<T> novaLista = new ListaEncadeada<>();
		NoLista<T> atual = this.primeiro;
		NoLista<T> anterior = null;
		for (int i = 0; i < this.getTamanho() / 2; i++) {
			anterior = atual;
			atual = atual.getProximo();
		}
		novaLista.primeiro = atual;
		novaLista.ultimo = this.ultimo;
		this.ultimo = anterior;
		anterior.setProximo(null);
		novaLista.qtdElementos = this.getTamanho() - (this.getTamanho() / 2);
		this.qtdElementos = this.getTamanho() / 2;

		return novaLista;
    }

    @Override
    public String exibir() {
        NoLista<T> p = primeiro;
       String str = "[";
       while (p != null) {
        str += p.getInfo() + ", ";
        p = p.getProximo();
       }
       return str + "]";
    }

    @Override
    public void concatenar(Lista<T> outraLista) {
        for (int i = 0; i < outraLista.getTamanho(); i++) {
            this.inserir(outraLista.pegar(i));
        }
    }

    @Override
    public void inserir(T valor) {
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(valor);
        if (this.estaVazia()) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
        qtdElementos++;
    }

    @Override
    public void inserir(T valor, int pos) {
       
    }

    @Override
    public void retirar(T valor) {
       NoLista<T> anterior = null;
       NoLista<T> p = primeiro;

       while ((p != null) & (p.getInfo() != valor)) {
            anterior = p;
            p = p.getProximo();
       }
       if (p != null) {
        if (anterior == null) {
            this.primeiro = p.getProximo();
        } else {
            anterior = p.getProximo();
        }
       }
    }

    //  questão 2 da revisão
    // public Lista<T> metodo() {
    //     NoLista<T> p1 = primeiro;
    //     NoLista<T> p2 = null;
    //     int temp;

    //     if (p1 != null) {
    //         // temp = p1.getInfo();
    //     }
    //     while (p1 != null) {
    //         if (p1.getInfo() > temp) {
    //             p2 = p1;
    //         }
    //         p1 = p1.getProximo();
    //     }
    //     return p1;
    // }
    
}
