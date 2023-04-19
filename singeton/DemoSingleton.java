package singeton;

import singeton.CarrinhoCompra;

/**
 @SINGETON:
  Usamos o padrao SINGETON quando criamos uma classe e só podemos usar apenas uma instância dessa classe para modelar
 nosso objeto alvo em questao,até que esse tal objeto se esgote...
 */

public class DemoSingleton {

    public static void main(String[] args) {

        System.out.println("Primeira chamada...");
        CarrinhoCompra meuCarrinho = new CarrinhoCompra();
        meuCarrinho.getInstance();

        System.out.println();
        System.out.println("Segunda chamada...");

        CarrinhoCompra meuCarrinho2 = new CarrinhoCompra();
        meuCarrinho2.getInstance();

    }
}
