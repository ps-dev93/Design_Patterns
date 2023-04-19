package singeton;

public class CarrinhoCompra {

    private static CarrinhoCompra instanciaCarrinho;

    public CarrinhoCompra getInstance() {

        if (instanciaCarrinho == null) {
            instanciaCarrinho = new CarrinhoCompra();
            System.out.println("Criando instância pela primeira vez..");
        } else {
            System.out.println("Uma instância ja foi criada...");
        }
        return instanciaCarrinho;

    }
}
