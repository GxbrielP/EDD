public class Arvore<T> {  
	private NoArvore<T> raiz;

	public void setRaiz(NoArvore<T> raiz) {
		this.raiz = raiz;
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

	public int getAltura() {
		if (this.vazia()) {
			return -1;
		} else {
			return raiz.getAltura();
		}
	}

	public int getNivel(T info) {
		if (this.pertence(info) == null) {
			return -1;
		} else {
			return this.raiz.getNivel(info);
		}
	}

	public boolean isBalanceada(){
		if (this.vazia()){
			return true;
		}
		return this.raiz.isBalanceada();
    }
}
