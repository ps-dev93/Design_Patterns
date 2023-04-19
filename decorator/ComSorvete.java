package decorator;

public class ComSorvete extends CafeDecorador {
    public ComSorvete(Cafe cafe) {
        super(cafe);

    }

    @Override
    public double informarPreco() {
        return super.informarPreco() + 3.0;
    }

    @Override
    public String informarIngredientes() {
        return super.informarIngredientes() + ", Sorvete de Creme";
    }

}
