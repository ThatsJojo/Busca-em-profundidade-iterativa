package busca.em.profundidade.iterativa.util;
import java.util.TreeSet;

public class Arvore{
    private final Node raiz;

    public Arvore() {
        raiz = new Node(null);
    }
    
    public boolean insert(Entry ob){
        if(raiz.conteudo == null){
            raiz.conteudo = ob;
            return true;
        }
        return insertRecursive(ob, raiz);
    }
    
    private boolean insertRecursive(Entry ob, Node pai){
        if(ob.equals(pai.conteudo))
            return false;
        if(ob.compareTo(pai.conteudo)>0){
            if(pai.direita == null){
                pai.direita = new Node(ob);
                return true;
            }
            return insertRecursive(ob, pai.direita);
        }else{
            if(pai.esquerda == null){
                pai.esquerda = new Node(ob);
                return true;
            }
            return insertRecursive(ob, pai.esquerda);
        }
    }
    
    
    public Object buscaProfundidade(int chave){
        Entry testEntry = new Entry(chave);
        if(raiz.conteudo == null)
            return null;
        if(raiz.conteudo.equals(testEntry)){
            return raiz.conteudo;
        }
        return buscaProfundidade(testEntry, raiz);
    }
    
    public Object buscaProfundidade(Entry test, Node pai){
        System.out.println("Comparei com: "+pai.conteudo.toString());
        if(pai.conteudo.equals(test)){
            return raiz.conteudo;
        }
        if(pai.esquerda!=null)
            buscaProfundidade(test, pai.esquerda);
        if(pai.direita!=null)
            buscaProfundidade(test, pai.direita);
        return null;
    }
    
    public Object buscaEmProfundiadeLimitada(int chave, int limite){
        if(limite <0)
            return null;
        int contador = 0;
        Entry testEntry = new Entry(chave);
        if(raiz.conteudo == null)
            return null;
        System.out.println("Comparei com: "+raiz.conteudo.toString());
        if(raiz.conteudo.equals(testEntry)){
            
            return raiz.conteudo;
        }
        if(limite>0)
            contador++;
        else
            return null;
        Object ret = null;
        if(raiz.esquerda!=null){
            ret = buscaProfundidadeLimitada(testEntry, raiz.esquerda, limite, contador);
        }
        if(ret!= null)
            return ret;
        if(raiz.direita!=null)
            ret = buscaProfundidadeLimitada(testEntry, raiz.direita, limite, contador);
        return ret;
    }

    private Object buscaProfundidadeLimitada(Entry test, Node pai, int limite, int contador) {
        if(contador>limite)
            return null;
        contador++;
        System.out.println("Comparei com: "+pai.conteudo.toString());
        if(pai.conteudo.equals(test)){
            return pai.conteudo;
        }
        Object ret = null;
        if(pai.esquerda!=null)
            ret = buscaProfundidadeLimitada(test, pai.esquerda, limite, contador);
        if(ret!=null)
            return ret;
        if(pai.direita!=null)
            ret = buscaProfundidadeLimitada(test, pai.direita, limite, contador);
        return ret;
    }
    
    public Object buscaProfundidadeIterativa(int chave, int limite){
        if (limite <0){
            return null;
        }
        int contador = 0;
        Object ret = null;
        while(limite>contador&&ret==null)
            ret = buscaEmProfundiadeLimitada(chave, contador++);
        return ret;
        
        
    }
    
    
    
    
    
    
    
    
    
    private class Node {
        private Entry conteudo;
        private Node pai;
        private Node esquerda;
        private Node direita;
        
        Node(Entry conteudo){
            this.conteudo = conteudo;
        }
    }
    
}
