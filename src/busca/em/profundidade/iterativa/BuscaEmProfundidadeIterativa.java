package busca.em.profundidade.iterativa;

import busca.em.profundidade.iterativa.util.Arvore;
import busca.em.profundidade.iterativa.util.Entry;

public class BuscaEmProfundidadeIterativa {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        
        System.out.println(arvore.insert(new Entry(10, "Um")));
        System.out.println(arvore.insert(new Entry(5, "Dois")));
        System.out.println(arvore.insert(new Entry(15, "Três")));
        System.out.println(arvore.insert(new Entry(3, "Quatro")));
        System.out.println(arvore.insert(new Entry(7, "cinco")));
        System.out.println(arvore.insert(new Entry(13, "Seis")));
        System.out.println(arvore.insert(new Entry(17, "Sete")));
        System.out.println(arvore.insert(new Entry(4, "Oito")));
        System.out.println(arvore.insert(new Entry(2, "Nove")));
        System.out.println(arvore.insert(new Entry(1, "Dez")));
        System.out.println(arvore.insert(new Entry(3, "Onze")));
        System.out.println(arvore.insert(new Entry(12, "Doze")));
        System.out.println(arvore.insert(new Entry(13, "Treze")));
        System.out.println(arvore.insert(new Entry(14, "Quatorze")));
        System.out.println(arvore.insert(new Entry(18, "Quize")));
        System.out.println(arvore.insert(new Entry(16, "Dezesseis")));
        
        //arvore.buscaProfundidade(18);
        //System.out.println("ENCONTREI "+ arvore.buscaEmProfundiadeLimitada(18, 3));
        System.out.println("ENCONTREI "+ arvore.buscaProfundidadeIterativa(18, 3));
        
    }
    
}
