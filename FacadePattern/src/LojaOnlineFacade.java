// Fachada
class LojaOnlineFacade {
    private Pedido pedido;
    private Pagamento pagamento;
    private Envio envio;

    public LojaOnlineFacade() {
        this.pedido = new Pedido();
        this.pagamento = new Pagamento();
        this.envio = new Envio();
    }

    public void finalizarCompra() {
        pedido.registrar();
        pagamento.processar();
        envio.enviar();
    }
}