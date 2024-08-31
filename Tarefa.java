public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int propriedade;

    //Construtor

    public Tarefa(String titulo, String descricao, String prazo, int propriedade) {
        this.titulo = titulo;
        this.descricao = new String();
        this.prazo = "";
        this.propriedade = 0;
    }

    //Método Get
    public String getTitulo(String args) {
        return "titulo: " + this.titulo + args;
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
    public int getPropriedade(){
        return this.propriedade;
    }
    public void setPropriedade(int propriedade){
        this.propriedade = propriedade;
    }
    public void exibirDetalhes(){
        System.out.println("Ttítulo" + this.titulo);
        System.out.println("Descrição" + this.descricao);
        System.out.println("Prazo" + this.prazo);
        System.out.println("Propriedade" + this.propriedade);
    }

}

