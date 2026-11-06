package br.ufpb.dcx.ayla.tarefas;
import java.util.List;
public class TestaMeuSistemaGerenciaDeTempo {
    public static void main(String[] args) {
        SistemaGerenciaDeTempo sistema = new MeuSistemaGerenciaDeTempo();
        sistema.cadastrarTarefa("Estudar LP", "Estudo", 120);
        sistema.cadastrarTarefa("Estudar LP", "Estudo", 80);
        sistema.cadastrarTarefa("Estudar Cálculo", "Estudo", 60);
        System.out.println(sistema.calcularTempoTotalDeTarefasComDescricao("Estudar LP"));
        List<Tarefa> tarefasEstudo = sistema.pesquisarTarefasDaCategoria("Estudo");
        for (Tarefa f : tarefasEstudo) {
            System.out.println(f.toString());
        }
        //TODO: completar a partir daqui
        //a)
        sistema.cadastrarTarefa("Fazer a feira", "Dona de casa", 20);

        //b)
        List<Tarefa> tarefas2 = sistema.pesquisarTarefasDaCategoria("Estudo");

        //c)
        for (Tarefa t: tarefas2){
            System.out.println(t.getDescricao());
        }
    }
}

