package arvores;

public class NoArvore<T> {
    private T info;
    private NoArvore<T> filho;
    private NoArvore<T> irmao;
    
    public NoArvore(T info) {
        this.info = info;
        this.filho = null;
        this.irmao = null;
    }
    
	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public String imprimePre() {
        String str = "<";
        str += this.info.toString();
        str += this.filho != null ? this.filho.imprimePre() : "";
        str += ">";
        str += this.irmao != null ? this.irmao.imprimePre() : "";
        return str;
    }
    
    public void inserirFilho(NoArvore<T> filhoNo) {
        filhoNo.irmao = this.filho;
        this.filho = filhoNo;
    }   
    
    public NoArvore<T> pertence(T info) {
        if(this.info.equals(info)) {
            return this;
        } else {
            NoArvore<T> noEncontrado = null;
            if (this.filho != null) {
                noEncontrado = this.filho.pertence(info);
            }
            if (noEncontrado == null && this.irmao != null) {
                noEncontrado = this.irmao.pertence(info);
            }
            return noEncontrado;
        }
    }
}
