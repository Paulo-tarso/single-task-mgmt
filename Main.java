public class Main{
    public static void main(String[] args) {
        // DESAFIO 3
        Categoria categoria = new Categoria("Matéria do curso de ADS");

        // DESAFIO 1
        Tarefa tarefa = new Tarefa("JavaScript", "Materia que eu não entendi", "5 meses", 1, categoria);
        tarefa.setTitulo("POO");
        System.out.println(tarefa.getTitulo()); 

        // DESAFIO 2
        tarefa.exibirDetalhes();
    }
}