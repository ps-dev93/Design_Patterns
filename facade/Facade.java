package facade;

/**
 @FACADE:
  O próposito do FACADE é fornecer uma interface para um pacote de classes,
 vale que resaltar que nesse padrão podemos implementar varias classes como fachada,
 com a seguinte finalidade de camuflar suposta complexidade de um sistema...
 */

public class Facade {
    private ClienteDoBanco cliente;
    private ContaBancaria conta;

    public Facade() {
        this.cliente = new ClienteDoBanco();
        this.conta = new ContaBancaria();
    }

    public void fazerDeposito(int quantidade, ClienteDoBanco cliente, ContaBancaria conta){
        System.out.printf("Olá, o beneficiário de seu depósito é o(a) cliente %s\n",cliente.obterNomeDoCliente());
        System.out.printf("Você escolheu a conta %s\n", conta.obterNumConta());
        System.out.printf("O saldo desta conta é: %d\n", conta.obterSaldo());
        System.out.printf("Você está depositando R$ %s\n", quantidade);
        conta.setSaldo(conta.getSaldo() + quantidade);
        System.out.printf("Depositado R$ %d na conta de %s\n",quantidade, cliente.obterNomeDoCliente());
        System.out.printf("O saldo desta conta é: R$ %s\n", conta.obterSaldo());
    }

    public ClienteDoBanco getCliente() {

        return cliente;
    }
    public void setCliente(ClienteDoBanco cliente)
    {
        this.cliente = cliente;
    }
    public ContaBancaria getConta() {

        return conta;
    }

    public void setConta(ContaBancaria conta) {

        this.conta = conta;
    }

}
