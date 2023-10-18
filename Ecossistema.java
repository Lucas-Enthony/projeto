import java.util.Random;

class Cenoura {
    private boolean comida;

    public Cenoura() {
        this.comida = true;
    }

    public boolean estaComida() {
        return comida;
    }

    public void serComida() {
        comida = false;
    }
}

class Coelho {
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

class Lobo {
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

public class Ecossistema {
    public static void main(String[] args) {
        Cenoura cenoura1 = new Cenoura();
        Coelho coelho1 = new Coelho();
        Lobo lobo1 = new Lobo();

        coelho1.comerCenoura(cenoura1);
        lobo1.cacarCoelho(coelho1);

        System.out.println("Estado do ecossistema:");
        System.out.println("Cenoura foi comida? " + !cenoura1.estaComida());
        System.out.println("O coelho está alimentado? " + coelho1.estaAlimentado());
        System.out.println("O lobo está alimentado? " + lobo1.estaAlimentado());
    }
}
