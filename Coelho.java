import java.util.Random;

public class Coelho {
    private boolean alimentado;
    private static Random random = new Random();

    public Coelho() {
        this.alimentado = true;
    }

    public boolean estaAlimentado() {
        return alimentado;
    }

    public void serComido() {
        alimentado = false;
    }

    public void comerCenoura(Cenoura cenoura) {
        if (cenoura.estaComida() && random.nextBoolean()) {
            alimentado = true;
            cenoura.serComida();
        } else {
            alimentado = false;
        }
    }
}
