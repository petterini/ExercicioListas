package ListaDuplamenteEncadeada;

public class Elemento {

    private Pessoa pessoa;
    private Elemento proximo;
    private Elemento anterior;

    public Elemento(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Elemento() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public Elemento getAnterior() {
        return anterior;
    }

    public void setAnterior(Elemento anterior) {
        this.anterior = anterior;
    }

    public String toString() {
        return this.pessoa.toString();
    }
}
