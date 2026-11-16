package br.ufpb.dcx.ayla.encomendas;

import java.util.ArrayList;
import java.util.List;

public class SistemaControlePedidosDeLP implements SistemaControlePedidos {
    private List<Pedido> pedidos;

    public SistemaControlePedidosDeLP() {
        this.pedidos = new ArrayList<>();
    }


    public List<Pedido> pesquisarPedidosDoCliente(String telefoneCliente) {
        List<Pedido> pedidosPesq = new ArrayList<>();
        for (Pedido pedido : this.pedidos) {
            if (pedido.getTelefoneCliente().equals(telefoneCliente)) {
                pedidosPesq.add(pedido);
            }
        }
        return pedidosPesq;
    }//… Outros métodos da classe

    public void cadastrarPedido(String codigo, String telefoneCliente, String descricao,
                                String dataHoraEntrega, boolean foiEntregue) throws PedidoJaExisteException{
        if (!pedidoExiste(codigo)){
            Pedido pedido = new Pedido(codigo, telefoneCliente, descricao, dataHoraEntrega, foiEntregue);
            this.pedidos.add(pedido);
        } else {
            throw new PedidoJaExisteException("Já existe pedido com o código "+ codigo);
        }

    }

    public boolean pedidoExiste(String codigo){
        for (Pedido p: this.pedidos){
            if (p.getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }

    public List<Pedido> pesquisarPedidosNaoEntregues() {
        List<Pedido> pedidosNaoEntregues = new ArrayList<>();
        for (Pedido p: this.pedidos){
            if (!p.foiEntregue()){
                pedidosNaoEntregues.add(p);
            }
        }
        return pedidosNaoEntregues;

    }

    public int pesquisarQuantidadeDePedidosDoCliente(String telefoneCliente){
        int quantidadeTotal = 0;
        for (Pedido p: this.pedidos){
            if (p.getTelefoneCliente().equals(telefoneCliente)){
                quantidadeTotal++;
            }
        }
        return quantidadeTotal;
    }

    public boolean pesquisarSePedidoFoiEntregue(String codigoPedido) throws PedidoNaoExisteException{
        for (Pedido p: this.pedidos){
            if (p.getCodigo().equals(codigoPedido)){
                return p.foiEntregue();
            }
        }
        throw new PedidoNaoExisteException("Não existe pedido com o código "+ codigoPedido);
    }


    public List<Pedido> pesquisarPedidosParaHorario(String dataHoraEntrega){
        List<Pedido> pedidosHorario = new ArrayList<>();
        for (Pedido p: this.pedidos){
            if (p.getDataHoraEntrega().equals(dataHoraEntrega)){
                pedidosHorario.add(p);
            }
        }
        return pedidosHorario;
    }

}