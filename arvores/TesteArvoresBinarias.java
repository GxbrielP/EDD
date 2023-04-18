package arvores;

public class TesteArvoresBinarias {
	public static void main(String[] args) {
		ArvoreBinariaBckp<Integer> arv = new ArvoreBinariaBckp<>();
		System.out.println("toString da arv: " + arv.toString());
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
		NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
		ArvoreBinariaBckp<Integer> arvore = new ArvoreBinariaBckp<>();
		arvore.setRaiz(no1);
		System.out.println("toString da arvore: " + arvore.toString());
		System.out.println(arvore.pertence(7).getInfo());
	}
}