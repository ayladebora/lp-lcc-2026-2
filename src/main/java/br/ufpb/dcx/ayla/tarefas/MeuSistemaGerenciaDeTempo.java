package br.ufpb.dcx.ayla.tarefas;

import java.util.ArrayList;
import java.util.List;


public class MeuSistemaGerenciaDeTempo implements SistemaGerenciaDeTempo {
    private List<Tarefa> tarefas;

    public MeuSistemaGerenciaDeTempo() {
        this.tarefas = new ArrayList<>();
    }


    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria) {
        List<Tarefa> tarefasPesq = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getCategoria().equals(categoria)) {
                tarefasPesq.add(tarefa);
            }
        }
        return tarefasPesq;
    }//… Outros métodos da classe

    public void cadastrarTarefa(String descricao, String categoria, int tempoEmMinutos){
        Tarefa t = new Tarefa(descricao, categoria, tempoEmMinutos);
        this.tarefas.add(t);
    }


    public List<Tarefa> pesquisarTarefasQueDuraramMaisDe(int tempoEmMinutos){
        List<Tarefa> tarefasPorDuracao = new ArrayList<>();
        for (Tarefa t: this.tarefas){
            if (t.getTempoTarefaEmMinutos()> tempoEmMinutos){
                tarefasPorDuracao.add(t);
            }
        }
        return tarefasPorDuracao;
    }
    public int calcularTempoTotalDeTarefasDaCategoria(String categoriaTarefa){
        int total = 0;
        for (Tarefa t: this.tarefas){
            if (t.getCategoria().equals(categoriaTarefa)){
                total+= t.getTempoTarefaEmMinutos();
            }
        }
        return total;
    }
    public int calcularTempoTotalDeTarefasComDescricao(String descricaoTarefa){
        int tempoTotal = 0;
        for (Tarefa t: this.tarefas){
            if (t.getDescricao().equals(descricaoTarefa)) {
                tempoTotal += t.getTempoTarefaEmMinutos();
            }
        }
        return tempoTotal;
    }
    public List<Tarefa> pesquisarTarefasPorDescricao(String descricao){
        //TODO
        return null;
    }

}

