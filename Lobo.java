import java.util.Random;

public class Lobo {
    private boolean alimentado;
    private static Random random = new Random();

    public Lobo() {
        this.alimentado = true;
    }

    public boolean estaAlimentado() {
        return alimentado;
    }

    public void cacarCoelho(Coelho coelho) {
        if (coelho.estaAlimentado() && random.nextBoolean()) {
            alimentado = true;
            coelho.serComido();
        } else {
            alimentado = false;
        }
    }
}
