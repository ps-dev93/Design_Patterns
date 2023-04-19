package strategy;

/**
 @STRATEGY:
    Usamos o padrão STRATEGY quando precisamos encapsular algoritmos a fim de tomar alguma decisão,
 nessa dinânimica não podemos alterar nossas classes apenas extende-las de maneira estratégica e elegânte...
 */

public interface PaymentStrategy {

    public void pay(int amount);

}
