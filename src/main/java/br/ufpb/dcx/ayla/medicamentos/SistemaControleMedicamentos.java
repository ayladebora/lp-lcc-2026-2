package br.ufpb.dcx.ayla.medicamentos;

import java.util.List;
public interface SistemaControleMedicamentos {
    public void cadastrarMedicamento(String nome, int dosagem, int hora);
    public List<Medicamento> pesquisarMedicamentosPorHora(int hora);
    public int calcularDosagemTotalDoDia(String nomeMedicamento);
    public List<Medicamento> filtrarMedicamentosNoturnos(); //horário maior ou igual a 18h
}

