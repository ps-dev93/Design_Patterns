package facade;

public class AplicacaoCliente {
    public static void main(String[] args) {

        ClienteDoBanco cliente = new ClienteDoBanco("Iglá Generoso");
        ContaBancaria conta = new ContaBancaria("1365-9");

        Facade facade = new Facade();
        facade.fazerDeposito(150, cliente, conta);

    }
}
