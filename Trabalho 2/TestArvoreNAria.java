public class TestArvoreNAria {
	public static void main(String[] args) {
		NoArvore<Integer> n9 = new NoArvore<Integer>(9);
		NoArvore<Integer> n10 = new NoArvore<Integer>(10);
		NoArvore<Integer> n11 = new NoArvore<Integer>(11);
		// NoArvore<Integer> n12 = new NoArvore<Integer>(12);
		// NoArvore<Integer> n13 = new NoArvore<Integer>(13);
		// NoArvore<Integer> n4 = new NoArvore<Integer>(4);
		// n4.inserirFilho(n10);
		// n4.inserirFilho(n9);
		// n11.inserirFilho(n12);
		// n12.inserirFilho(n13);
		NoArvore<Integer> n8 = new NoArvore<Integer>(8);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		NoArvore<Integer> n7 = new NoArvore<Integer>(7);
		// n8.inserirFilho(n11);
		n3.inserirFilho(n8);
		n3.inserirFilho(n7);
		NoArvore<Integer> n5 = new NoArvore<Integer>(5);
		NoArvore<Integer> n6 = new NoArvore<Integer>(6);
		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n6.inserirFilho(n11);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);
		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		// n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);
		Arvore<Integer> arvore = new Arvore<>();
		arvore.setRaiz(n1);
		// System.out.println(arvore);
		// System.out.println(arvore.pertence(2).getInfo());
		// System.out.println(arvore.pertence(3).getInfo());
		// System.out.println(arvore.pertence(11));
		// System.out.println(arvore.pertence(8).getInfo());
		// System.out.println(arvore.pertence(6).getInfo());
		// System.out.println(arvore.getAltura());
		// System.out.println(arvore.getNivel(5));
		System.out.println(arvore.isBalanceada());
	}
}