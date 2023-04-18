package arvores;

public class ArvoreBST<T extends Comparable<T>> extends NoArvoreBinaria<T> {

    public ArvoreBST() {
    }
    
    public inserir(T info){

    }

    public NoArvoreBST<T> buscar(T info) {
        if ((info.compareTo(this.getInfo()) == 0) == info.equals(this.getInfo())) {
            return this.getInfo();
        } else if ((info.compareTo(this.getInfo()) < 0) != info.equals(this.getInfo())) {

        }
    }
}
