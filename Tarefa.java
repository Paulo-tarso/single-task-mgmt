public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;
    private Categoria categoria;

    //Construtor
    public Tarefa(String titulo, String descricao, String prazo, int prioridade, Categoria categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
        this.categoria = categoria;
    }

    //Método Get
    public String getTitulo() {
        return this.titulo;
    }
    //Método Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    // Outros gettes e settes aqui...
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getPrazo(){
        return this.prazo;
    }
    public void setPrazo(String prazo){
        this.prazo = prazo;
    }
    public int getPrioridade(){
        return this.prioridade;
    }
    public void setPrioridade(int prioridade){
        this.prioridade = prioridade;
    }
    public void exibirDetalhes(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Prazo: " + this.prazo);
        System.out.println("Propriedade: " + this.prioridade);
        System.out.println("Categoria: " + this.categoria.getNome());
    }

}

