package lineares;
public class Principal {
    public static void main(String[] args) {

        int limite = 5;

        Pilha<Integer> pilha = new PilhaVetor<Integer>(limite);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        
        Pilha<Integer> pilha2 = new PilhaVetor<Integer>(limite);
        pilha2.push(5); 
        pilha2.push(6);
        pilha2.push(7);
        pilha2.push(8);

       // System.out.println(pilha.compara(pilha2));

        System.out.println("---------------------------------");

        System.out.println("Tirei: " + pilha.pop());
        System.out.println(pilha.toString());
        pilha.liberar();
        System.out.println(pilha.toString());
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        System.out.println(pilha.toString());
    }
}
