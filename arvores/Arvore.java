package arvores;

public class Arvore<T> {  // contribuição do Jonathan

	private NoArvore<T> raiz;

	public void setRaiz(NoArvore<T> noRaiz) {
		this.raiz = noRaiz;
	}

	public NoArvore<T> getRaiz() {
		return this.raiz;
	}

	public String toString() {
		if (this.vazia()) {
			return "<>";
		}
		return this.raiz.imprimePre();
	}

	public boolean vazia() {
		return this.raiz == null;
	}

	public NoArvore<T> pertence(T info) {
		if (this.vazia()) {
			return null;
		}
		return this.raiz.pertence(info);
	}

}
