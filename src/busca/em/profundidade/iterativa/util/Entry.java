package busca.em.profundidade.iterativa.util;

public class Entry {
    private final int chave;
    private final Object conteudo;

    public Entry(int chave, Comparable conteudo) {
        this.chave = chave;
        this.conteudo = conteudo;
    }
    
    public Entry(int chave){
        this.chave = chave;
        this.conteudo = null;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.chave;
        return hash;
    }

    public int getChave() {
        return chave;
    }

    public Object getConteudo() {
        return conteudo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entry other = (Entry) obj;
        return this.chave == other.chave;
    }

    public int compareTo(Entry entry) {
        return this.chave - entry.chave;
    }

    @Override
    public String toString() {
        return "Entry{" + "chave=" + chave + ", conteudo=" + conteudo + '}';
    }
    
    
    


    
}
