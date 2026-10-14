package br.ufpb.dcx.ayla.funcionarios;

import java.util.ArrayList;
import java.util.List;

public class SistemaFuncionariosList {
    private List<Funcionario> funcionarios;




    public SistemaFuncionariosList(){
        this.funcionarios = new ArrayList<>();
    }

    public void cadastrarFuncionario(String cpf, String nome,
                                     int cargaHorariaSemanal, String funcao){
        Funcionario f = new Funcionario(cpf, nome, cargaHorariaSemanal, funcao);
        funcionarios.add(f);
    }

    public Funcionario pesquisarFuncionarioPorCpf(String cpf){
        for (Funcionario f: this.funcionarios){
            if (f.getCpf().equals(cpf)){
                return f;
            }
        }
        return null;
    }


    public List<Funcionario> pesquisarFuncionariosPorFuncao(String funcao){
        List<Funcionario> funcionariosPorFuncao = new ArrayList<>();
        for (Funcionario f: this.funcionarios){
            if (f.getFuncao().equals(funcao)){
                funcionariosPorFuncao.add(f);
            }
        }
        return funcionariosPorFuncao;
    }

    public List<Funcionario> pesquisarFuncionariosQueTrabalhamMaisQue(int cargaHorariaSemanal){
        List<Funcionario> funcionariosTrabalhadores = new ArrayList<>();
        for (Funcionario f: this.funcionarios){
            if (f.getCargaHorariaSemanal()> cargaHorariaSemanal){
                funcionariosTrabalhadores.add(f);
            }
        }
        return funcionariosTrabalhadores;
    }

    public boolean atualizarCargaHorariaDeFuncionario(String cpf, int novaCargaHoraria){
        boolean atualizado = false;
        for (Funcionario f: this.funcionarios){
            if (f.getCpf().equals(cpf)){
                f.setCargaHorariaSemanal(novaCargaHoraria);
                atualizado = true;
                break;
            }
        }
        return atualizado;
    }
}
