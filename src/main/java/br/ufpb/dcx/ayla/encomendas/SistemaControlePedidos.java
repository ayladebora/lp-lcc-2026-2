package br.ufpb.dcx.ayla.encomendas;
import java.util.List;
public interface SistemaControlePedidos {
    public void cadastrarPedido(String codigo, String telefoneCliente, String descricao,
                                String dataHoraEntrega, boolean foiEntregue)
                                throws PedidoJaExisteException;
    public List<Pedido> pesquisarPedidosDoCliente(String telefoneCliente);
    public List<Pedido> pesquisarPedidosNaoEntregues();
    public List<Pedido> pesquisarPedidosParaHorario(String dataHoraEntrega);
    public boolean pesquisarSePedidoFoiEntregue(String codigoPedido)
            throws PedidoNaoExisteException;
    public int pesquisarQuantidadeDePedidosDoCliente(String telefoneCliente);
}

