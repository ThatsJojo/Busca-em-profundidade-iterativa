package busca.em.profundidade.iterativa;

import busca.em.profundidade.iterativa.util.Arvore;
import busca.em.profundidade.iterativa.util.Entry;

public class BuscaEmProfundidadeIterativa {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        
        arvore.insert(new Entry(10, "1"));
        arvore.insert(new Entry(5, "2"));
        arvore.insert(new Entry(15, "3"));
        arvore.insert(new Entry(3, "4"));
        arvore.insert(new Entry(7, "5"));
        arvore.insert(new Entry(13, "6"));
        arvore.insert(new Entry(17, "7"));
        arvore.insert(new Entry(4, "8"));
        arvore.insert(new Entry(2, "9"));
        arvore.insert(new Entry(1, "10"));
        arvore.insert(new Entry(3, "11"));
        arvore.insert(new Entry(12, "12"));
        arvore.insert(new Entry(13, "13"));
        arvore.insert(new Entry(14, "14"));
        arvore.insert(new Entry(18, "15"));
        arvore.insert(new Entry(16, "16"));
        
        //arvore.buscaProfundidade(18);
        //System.out.println("ENCONTREI "+ arvore.buscaEmProfundiadeLimitada(18, 3));
        System.out.println("ENCONTREI "+ arvore.buscaProfundidadeIterativa(18, 4));
        
    }
    
}
