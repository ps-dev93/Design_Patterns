package decorator;

public class Main {
    public static void ìmprimirInfo(Cafe c) {
        System.out.println("Preço: " + c.informarPreco() + "Ingredientes: " + c.informarIngredientes());
    }

    public static void main(String[] args) {
        Cafe c = new CafeSimples();
        ìmprimirInfo(c);

        c = new ComLeite(c);
        ìmprimirInfo(c);

        c = new CafeSimples();
        c=  new ComSorvete(c);
        ìmprimirInfo(c);
    }
}
