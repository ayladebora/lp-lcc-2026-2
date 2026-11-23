package br.ufpb.dcx.ayla.atletas;
import java.util.List;

/**
 * Interface com as operações de um sistema de atletas
 */
public interface SistemaGerenciaDeAtletas {

    /**
     * Cadastra um novo atleta no sistema.
     * @param codigoAtleta O código do atleta a ser cadastrado
     * @param idade A idade do atleta a ser cadastrado.
     * @param telefones A lista dos telefones do atleta a ser cadastrado.
     */
    public void cadastrarAtleta(String codigoAtleta, int idade,
                                List<Telefone> telefones);
    public List<Atleta> pesquisarAtletasComIdadeEntre(int idadeInferior,
                                                      int idadeSuperior);

    /**
     * Pesquisa a maior idade entre as idades dos atletas cadastrados.
     * @return a maior idade entre as idades dos atletas cadastrados ou -1
     * se nenhum atleta estiver cadastrado no sistema.
     */
    public int pesquisarMaiorIdadeDosAtletas();
    public void cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel)
            throws AtletaNaoExisteException;
    public boolean apagarTelefoneDeAtleta(String codigoAtleta, Telefone tel);

}

