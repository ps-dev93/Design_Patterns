package decorator;

/**
 @DECORATOR:
 Usamos DECORATOR quando procuramos por uma alternativa para criação de subcclasses para estender funcionalidades,
 a intêncão é anexar dinamicamente responsabilidades adicionais flexíveis ao objeto...
 */

public abstract class CafeDecorador implements Cafe {
    private final Cafe cafeDecorador;

    public CafeDecorador(Cafe cafe) {
        this.cafeDecorador = cafe;
    }

    @Override
    public double informarPreco() {
        return cafeDecorador.informarPreco();
    }

    @Override
    public String informarIngredientes() {
        return cafeDecorador.informarIngredientes();
    }

    public Cafe getCafe() {
        return cafeDecorador;
    }

}
