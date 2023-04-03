package lineares;

public class FilaLista<T> implements Fila<T> {
	private ListaEncadeada<T> lista;

	public FilaLista() {
		lista = new ListaEncadeada<>();
	}

	@Override
	public void inserir(T valor) {
		lista.inserir(valor);
	}

	@Override
	public T peek() {
		if (estaVazia())
            throw new RuntimeException("Pilha está vazia");
		return lista.pegar(0);
	}

	@Override
	public T retirar() {
		T valor = this.peek();
		lista.retirar(valor);
		return valor;
	}

	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}

	@Override
	public void liberar() {
		lista = new ListaEncadeada<>();
	}

	@Override
	public String toString() {
		return lista.exibir();
	}
		

}