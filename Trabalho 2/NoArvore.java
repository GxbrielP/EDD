public class NoArvore<T> extends Arvore<T> {
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

    public NoArvore<T> testa(T info) {
        if(this.info.equals(info)) {
            return this;
        } else return null;
    }

    public int getAltura() {
        int altura = 0;
        if (this.filho != null) {
            altura++;
            altura += this.filho.getAltura();
		}
		if (this.irmao != null) {
            int altura2 = 0;
            altura2 += this.irmao.getAltura();
		    if (altura < altura2) {
                altura = altura2;
            }
        }
		return altura;
	}

   // Só vai até 2
    public int getNivel(T info) {
        int nivel = 0;
        while (!this.info.equals(info)) {
            if (this.filho != null) {
                nivel++;
                nivel+=filho.getNivel(info);
                if (this.filho.testa(info) != null){
                    return nivel;
                } 
            }

            if (this.irmao != null) {
                if (this.irmao.testa(info) != null) {
                    return nivel;
                }
                irmao.getNivel(info);
            }
            return nivel;
        }
        return nivel;
    }

    public boolean isBalanceada() {
        return false;
    }
}