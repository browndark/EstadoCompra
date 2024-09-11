import dados.Pedido;
import dados.EstadoPedido;

public class Principal {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println(" ");
        System.out.println("@brunoccs100");
        System.out.println(" ");
        System.out.println("=================================================");
        Pedido pedido = new Pedido();
        System.out.println("Estado inicial: " + pedido.getEstado());
        pedido.pagar();
        System.out.println("Estado atual: " + pedido.getEstado());
        pedido.pagar();
        System.out.println("Estado atual: " + pedido.getEstado());
        pedido.enviar();
        System.out.println("Estado atual: " + pedido.getEstado());
        pedido.entregar();
        System.out.println("Estado atual: " + pedido.getEstado());
        pedido.cancelar();
    }
}
