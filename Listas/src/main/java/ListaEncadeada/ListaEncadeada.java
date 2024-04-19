package ListaEncadeada;

public class ListaEncadeada {

    private Elemento inicio;
    private int tamanho;

    public ListaEncadeada() {
        this.tamanho = 0;
    }

    public void adicionar(Pessoa pessoa) {
        if (this.inicio == null) {
            this.inicio = new Elemento(pessoa);
        } else {
            Elemento e = this.inicio;
            while (e.getProximo() != null) {
                e = e.getProximo();
            }
            e.setProximo(new Elemento(pessoa));
        }
        this.tamanho++;
    }

    public boolean remover(String pessoa) {
        Elemento e = this.inicio;
        if (e.getPessoa().getNome().equals(pessoa)) {
            this.inicio = e.getProximo();
            this.tamanho--;
            return true;
        } else {
            while (e.getProximo() != null) {
                if (e.getProximo().getPessoa().getNome().equals(pessoa)) {
                    e.setProximo(e.getProximo().getProximo());
                    this.tamanho--;
                    return true;
                }
                e = e.getProximo();
            }
            return false;
        }
    }

    public void listar() {
        if (this.inicio == null) {
            System.out.println("A lista está vazia.");
        } else {
            Elemento e = this.inicio;
            System.out.println(e);
            while (e.getProximo() != null) {
                e = e.getProximo();
                System.out.println(e);
            }
        }
    }

    public void inserir(Pessoa pessoa, int pos) {
        if (this.tamanho <= pos) {
            adicionar(pessoa);
        }
        if (pos == 0) {
            Elemento aux = this.inicio;
            this.inicio = new Elemento(pessoa);
            Elemento e = this.inicio;
            e.setProximo(aux);
        } else {
            Elemento e = this.inicio;
            int x = 0;
            while (x < pos - 1) {
                e = e.getProximo();
                x++;
            }
            Elemento aux = e.getProximo();
            e.setProximo(new Elemento(pessoa));
            e.getProximo().setProximo(aux);
        }
    }
}
