package br.ufpb.dcx.ayla.medicamentos;

import java.util.ArrayList;
import java.util.List;

public class MeuSistemaControleMedicamentos implements SistemaControleMedicamentos {
    private List<Medicamento> medicamentos;
    public  MeuSistemaControleMedicamentos() {
        medicamentos = new ArrayList<>();
    }
    // ... outros métodos

    @Override
    public void cadastrarMedicamento(String nome, int dosagem, int hora){
        Medicamento m = new Medicamento(nome, dosagem, hora);
        this.medicamentos.add(m);
    }

    @Override
    public List<Medicamento> pesquisarMedicamentosPorHora(int hora) {
        List<Medicamento> medicamentosPorHora = new ArrayList<>();
        for (Medicamento m: this.medicamentos){
            if (m.getHora() == hora){
                medicamentosPorHora.add(m);
            }
        }
        return medicamentosPorHora;
    }

    @Override
    public int calcularDosagemTotalDoDia(String nomeMedicamento) {
        int total = 0;
        for (Medicamento medicamento: this.medicamentos){
            if (medicamento.getNome().equals(nomeMedicamento)){
                total+= medicamento.getDosagem();
            }
        }
        return total;
    }

    @Override
    public List<Medicamento> filtrarMedicamentosNoturnos(){
        List<Medicamento> listaMed = new ArrayList<>();
        for (Medicamento m: this.medicamentos){
            if (m.getHora()>=18){
                listaMed.add(m);
            }
        }
        return listaMed;
    }


}

