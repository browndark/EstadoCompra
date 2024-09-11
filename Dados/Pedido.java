package dados;

public class Pedido {
    private dados.EstadoPedido estado;

    public Pedido() {
        this.estado = dados.EstadoPedido.CRIADO;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void pagar() {
        if (estado == dados.EstadoPedido.CRIADO) {
            estado = dados.EstadoPedido.AGUARDANDO_PAGAMENTO;
            System.out.println("Pedido aguardando pagamento.");
        } else if (estado == dados.EstadoPedido.AGUARDANDO_PAGAMENTO) {
            estado = dados.EstadoPedido.PAGAMENTO_CONFIRMADO;
            System.out.println("Pagamento confirmado.");
        } else {
            System.out.println("Não é possível processar o pagamento neste estado.");
        }
    }

    public void enviar() {
        if (estado == dados.EstadoPedido.PAGAMENTO_CONFIRMADO) {
            estado = dados.EstadoPedido.ENVIADO;
            System.out.println("Pedido enviado.");
        } else {
            System.out.println("Não é possível enviar o pedido neste estado.");
        }
    }

    public void entregar() {
        if (estado == dados.EstadoPedido.ENVIADO) {
            estado = dados.EstadoPedido.ENTREGUE;
            System.out.println("Pedido entregue.");
        } else {
            System.out.println("Não é possível entregar o pedido neste estado.");
        }
    }

    public void cancelar() {
        if (estado == dados.EstadoPedido.CRIADO || estado == dados.EstadoPedido.AGUARDANDO_PAGAMENTO) {
            estado = dados.EstadoPedido.CANCELADO;
            System.out.println("Pedido cancelado.");
        } else {
            System.out.println("Não é possível cancelar o pedido neste estado.");
        }
    }
}
